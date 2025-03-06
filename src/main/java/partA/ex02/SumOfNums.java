package partA.ex02;

import java.util.Scanner;

public class SumOfNums {
    public static String sum() {
        String response = "";
        Scanner input = new Scanner(System.in);

        int num;
        do {
            System.out.println("Enter a non-negative integer ( or -1 to quit): ");
            num = input.nextInt();

            if (num == -1) {
                break;
            } else if (num <= 0) {
                System.out.println("Invalid number, try again:");
            } else {
                System.out.println("The square root of " + num + " is: 1" + Math.sqrt(num));
            }
        } while (true);

        input.close();
        return response;
    }


    public static void main(String args[]) {
        String outputSum = sum();
        System.out.println(outputSum);
    }
}
