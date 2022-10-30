package Day3;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int min = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
