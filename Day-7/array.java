import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//    int[] arr = new int[5];
//
//
//
//    for(int i=0;i<arr.length;i++){
//        arr[i] = sc.nextInt();
//    }

//    for(int i=0;i<arr.length;i++){
//        System.out.print(arr[i]);
//    }

        // for loop //
//        for(int num:arr){
//            System.out.print(num+" ");
//        }

          // to string method //
//        System.out.println(Arrays.toString(arr));


//        // 2D array
        int[][ ] arr = new int [3] [3];
//
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();

        }
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

//       for(int[] a : arr){
//           System.out.println(Arrays.toString(a));
//       }




    }


}
