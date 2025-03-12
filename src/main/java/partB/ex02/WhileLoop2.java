package partB.ex02;
import java.util.Scanner;

public class WhileLoop2 {
    public static String whileLoopTwo(){
        String response = "";
        Scanner in = new Scanner(System.in);

        int num = -1;

        System.out.println("Please enter a number to count to: ");
        int count = in.nextInt();

        while(num < count){
            num = num + 1;
            response +=("\nThe Current Number is: " + num);
        }
        response += ("\nWe are done");




        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopTwo = whileLoopTwo();
        System.out.println(outputWhileLoopTwo);

    }
}
