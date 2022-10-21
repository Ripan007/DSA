public class max {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,9};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxValue = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]> maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
