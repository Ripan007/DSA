package day1;

public class matrixColNotFixed {
    public static void main(String[] args) {
     int[][] arr =  {

             {2,3},
             {1,4,5},
             {9,0,3}
     };

     for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
             System.out.print(arr[i][j]+" ");
         }
         System.out.println();
     }
    }
}
