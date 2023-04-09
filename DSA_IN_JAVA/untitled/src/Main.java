public class Main {
    //not completed`
    public static void main(String[] args) {
        //in binary search data should be in sorted

        binarySearch();
    }

    public static void binarySearch() {
        int[] array = {0,1,2,3,4,5,6,7,8,9};

        int l=0;
        int r= array.length;
        int mid;
        int key;

        mid = (l + r) / 2;
        if(key==a[mid]){
            System.out.println("The key is in Index",mid);
        }
       else if (key > a[mid]) {

            r = mid-1;
        }
       else if (key < a[mid]) {

            l=mid+1;
        }
       else{
           l=mid+1;
        }
    }
}