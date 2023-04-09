import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter the Number :");
//        int num= scanner.nextByte();
//       primeOrNot(num) ;
//       pattern();
//       sumOfElementArray();
//       maxAndmin();
//        removeVowel();

    }
    public static void primeOrNot(int p){
        int count=0;
    for(int i=1;i<=p;i++){
        if(p%i==0){
            count++;

        }
    }
    if (count==2){
        System.out.println("prime number");
    } else if (count==1) {
        System.out.println("prime Number");

    } else {
        System.out.println("Not Prime");
    }

    }
    public static void pattern(){
        for(int i=0;i<5;i++){
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=5;j>i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void sumOfElementArray(){
        int i=0;
        int sum=0;
        int[] arr={ 0,1,2,3,4,5};
        while(i<6){
            sum=sum+arr[i];
          i++;
        }
        System.out.println("Sum= "+sum);
    }
    public static void maxAndmin(){
        int[] arr={4,6,9,2,12,24,-1};
        int temp=0;
        int min=0;

        for(int i=0;i<(arr.length-1);i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i+1];
            }
            if (arr[i] < arr[i+1]) {
                min=arr[i];

            }
        }
        System.out.println("Min= "+temp);
        System.out.println("Max= "+min);



    }

public static void removeVowel(){
        char ch;
        String str2=new String();
        String str="Mobile is Dead";
        for(int i=0;i<+str.length();i++){
          ch=str.charAt(i);
          if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          }
          else{
              str2+=ch;
          }

        }
    System.out.print(str2);
        

}

}