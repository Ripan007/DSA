package Day5;

public class max {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{5,6,7},{8,9,10}};
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][i] > max){
                    max = arr[i][j];

                }
            }
        }
        return max;
    }
}
