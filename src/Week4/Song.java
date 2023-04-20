package Week4;

public class Song {

    private String title = "";
    private String interpret = "";
    private String fileName = "";
    private String directory = "";

    Song (String pathName) {
        String pathNameWithForwardSlashes = pathName.replaceAll("\\\\", "/")
                .replaceAll(":", "");

        String[] splitStringArray = pathNameWithForwardSlashes.split("/");
        String[] splitLastArgument = splitStringArray[splitStringArray.length - 1].split(" – ");

        int fileNameLength = splitLastArgument.length;
        int posOfLastDash = splitLastArgument[fileNameLength-1].lastIndexOf(" - ");

        //evaluates the title if it exists
        if (!(pathNameWithForwardSlashes.endsWith("/"))) {
            int posOfLastDot = splitLastArgument[fileNameLength - 1].lastIndexOf(".");

            if (pathNameWithForwardSlashes.contains(".") && pathNameWithForwardSlashes.contains("-"))
            {
                title = splitLastArgument[fileNameLength - 1].substring(posOfLastDash + 3, posOfLastDot).strip();
            }
            else if (pathNameWithForwardSlashes.contains("."))
            {
                title = splitLastArgument[fileNameLength - 1].substring(0, posOfLastDot).strip();
            }
            else if (pathNameWithForwardSlashes.contains("-"))
            {
                title = splitLastArgument[fileNameLength - 1].substring(0, fileNameLength).strip();
            }
            else
            {
                title = splitLastArgument[fileNameLength - 1].strip();
            }
        }

        //evaluates interpret of the song if existing
        if (splitLastArgument[0].contains(" - ")) {
            interpret = splitLastArgument[fileNameLength - 1].substring(0, posOfLastDash).strip();
        }

        if (pathNameWithForwardSlashes.contains("/")) {
            int posOfLastSlash = pathNameWithForwardSlashes.lastIndexOf("/");
            directory = "/" + pathNameWithForwardSlashes.substring(0, posOfLastSlash) + "/";
            if (pathNameWithForwardSlashes.charAt(0) == '/' || pathNameWithForwardSlashes.charAt(2) == '/') {
                directory = directory.substring(1);
            }
        }

        if (!(pathNameWithForwardSlashes.endsWith("/")))
            fileName = splitStringArray[splitStringArray.length - 1];
        }
    public void printAttributes() {
        System.out.println("title: " + getTitle());
        System.out.println("interpret: " + getInterpret());
        System.out.println("directory: " + getDirectory());
        System.out.println("file name: " + getFileName());
    }
    public String getTitle() {
        return title;
    }

    public String getInterpret() {
        return interpret;
    }

    public String getFileName() {
        return fileName;
    }

    public String getDirectory() {
        return directory;
    }
}