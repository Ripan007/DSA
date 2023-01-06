package Array;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
     int arr [] = {1,2,3,4,5};

    // first approach

//    for(int i=arrLen -1;i>=0;i--){
//        System.out.print(arr[i]);
//    }
        // second approach

        int i=0, j= arr.length-1,temp;

        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }

        System.out.print(Arrays.toString(arr));
    }

}
