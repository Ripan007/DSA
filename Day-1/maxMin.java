package day1;

public class maxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,89};
        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("the max value :"+" "+ max);
        System.out.println("the min value :"+" "+ min);
    }
}
