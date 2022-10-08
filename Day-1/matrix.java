package day1;

import java.util.Arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int size = s.nextInt();
    int[][] arr = new int[size][size];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j] = s.nextInt();
        }
    }

//    for(int i=0;i<arr.length;i++){
//        for(int j=0;j<arr[i].length;j++){
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//    }

//        for(int i=0;i<arr.length;i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for(int[] el : arr){
            System.out.println(Arrays.toString(el));
        }
    }
}
