package day1;

public class array {
    public static void main(String[] args) {
        // way to print array
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // first way
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        // second way
        // for each loop
        for(int el:arr){
            System.out.print(el+" ");
        }

        // third way
        // to string method
        // according to me the best way to print
//        System.out.print(Arrays.toString(arr));

     }


}
