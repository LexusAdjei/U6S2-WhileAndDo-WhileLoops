package partB.ex01;

public class DoWhileLoop2 {
    public static String doWhileLoopTwo(){
        String response = "";
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int i = 0;
        while (i < nums.length){
            if(nums[i] % 2 !=  0){
                System.out.println(nums[i] + " ");
            }
            i++;

        }




        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileTwo = doWhileLoopTwo();
        System.out.println(outputDoWhileTwo);
    }
}
