public class Main {
    public static void main(String[] args) {
        //5 row 5 column
//       for(int i=0;i<5;i++){
//           for(int j=0;j<5;j++){
//               System.out.print("*");
//           }
//           System.out.print("\n");
//       }
        //50 row 100 column
//        for (int i = 0; i < 50; i++) {
//            for (int j = 0; j < 100; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
//        //right triangle pattern
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        //down right angle
//        System.out.println("\n\n");
//        for (int i = 0; i < 100; i++) {
//            for (int j = 0; j <100-i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        System.out.println("\n\n");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <5-i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        for(int i=0;i<5;i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int k=0;k<4;k++){
            for(int l=0;l<4-k;l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
   }

}
