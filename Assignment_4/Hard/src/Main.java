public class Main {
    public static void main(String[] args) {
        System.out.println("Example 1");
       int[] answer=example1();
       System.out.print("Output:[");
        for (int i:answer) {

            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("]");

        System.out.println("\n\nExample 2");
        int[] result=example2();
        System.out.print("Output:[");
        for (int j:result
        ) {

            System.out.print(j);
            System.out.print(",");

        }
        System.out.print("]");

    }
  //  zero_BasedPermutation
    //example1
    public static int[] example1(){
        int[] nums={0,2,1,5,3,4};
        System.out.println("Input:[0,2,1,5,3,4]");
        int[] ans= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;

    }

    //example2
    public static int[] example2(){
        int[] nums={5,0,1,2,3,4};
        System.out.println("Input:[5,0,1,2,3,4]");
        int[] ans= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;

    }

}