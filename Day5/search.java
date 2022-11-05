package Day5;

import java.util.Arrays;

public class search {
    public static void main(String[] args) {
    int[][] arr = {{2,4},{3,5,6},{9,7,1}};
    int target = 5;
    int[] ans = find(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int [] {-1,-1};
    }
}
