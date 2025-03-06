package partB.ex01;

public class DoWhileLoop1 {
    public static String doWhileLoopOne(){
        String response = "";
        int[] demNums = {43, 55, 68, 91, 105};

        int i = 0;
        while (i < demNums.length){
            System.out.println(demNums[i] + " ");
            i++;
        }


        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileOne = doWhileLoopOne();
        System.out.println(outputDoWhileOne);
    }
}
