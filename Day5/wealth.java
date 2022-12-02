package Day5;

import java.util.Arrays;

public class wealth {
    public static void main(String[] args) {
        int[][] acc = {{3,5},{6,7},{7,9}};
        System.out.println(Arrays.toString(acc));

    }
    
    public int maximumWealth(int[][] acc){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<acc.length;i++){
            int sum = 0;
            for(int j=0;j<acc[i].length;j++){
                sum+=acc[i][j];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
