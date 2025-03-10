package partB.ex02;
import java.util.Scanner;

public class WhileLoop2 {
    public static String whileLoopTwo(){
        String response = "";
        System.out.println("Please enter a number to count to: ");
        Scanner in = new Scanner(System.in);
        in.nextInt();

        int number = Integer.parseInt(in.nextLine());

        while(in <= number){
            System.out.println("The Current Number is: " + number);
        }


        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopTwo = whileLoopTwo();
        System.out.println(outputWhileLoopTwo);

    }
}
