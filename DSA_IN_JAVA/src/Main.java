public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Searching...");
        int[] array={1,2,3,4,5,6,7,8,9,0};
        int target=10;
       int result=linearSearching(array,target);
        System.out.println("Index is "+ result);

    }
    public static int linearSearching(int[] a,int t){
        for(int i=0;i<a.length;i++){
            if(a[i]==t){

               return i;
            }
        }
  return -1; }
}