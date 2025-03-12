package partB.ex02;

public class WhileLoopDemoExample {

    public static String whileLoop(){
        String response = "";

        int num = 0;
        response += ("Let's count to 10!");
        while(num < 10){
            num = num + 1;
            response += ("Number: " + num);
        }
        response += ("We have counted to 10! Hurrah!");

        return response;

    }
    public static void main(String[] args) {
        String outputWhileLoop = whileLoop();
        System.out.println(outputWhileLoop);
    }


}
