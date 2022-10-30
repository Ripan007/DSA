package Day3;
// write  a program to reverse an array or string
public class Reverse {
    // reverse an Array
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverseArray(arr,0,3);
        printArray(arr,4);
    }
    static void reverseArray(int[] arr , int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int[] arr, int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
