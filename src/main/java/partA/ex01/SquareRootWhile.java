package partA.ex01;

import java.util.Scanner;

public class SquareRootWhile {
    public static String squareRoot() {
        String response = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-negative integer ( or -1 to quit): ");
        int num = input.nextInt();

        while (num != -1) {
            if (num <= 0) {
                System.out.println("Invalid number, try again:");
            } else if (num > 0) {
                System.out.println("The square root of " + num + " is: 1" + Math.sqrt(num));
            }
            num = input.nextInt();
        }
       input.close();



        return response;
    }
    public static void main(String args[]) {
        String outputSquareRoot = squareRoot();
        System.out.println(outputSquareRoot);

    }
}
