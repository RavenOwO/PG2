package Week2;

import java.util.Scanner;

public class Rechenoperationen {

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);

        float float1 = sc.nextFloat();
        float float2 = sc.nextFloat();

        float sum = float1 + float2;
        float product = float1 * float2;
        int count = 2;

        while (true) {
            System.out.print("Enter further numbers (0/1)? ");
            float continueLoop = sc.nextFloat();

            if (continueLoop == 1) {
                System.out.println("Enter number: ");
                float number = sc.nextFloat();
                sum += number;
                product *= number;
                count++;
            } else if (continueLoop == 0) {
                break;
            }
        }

        System.out.println();
        System.out.println("sum: " + (double) sum);
        System.out.println("product: " + (double) product);
        System.out.println("average: " + sum / (float) count);
    }
}