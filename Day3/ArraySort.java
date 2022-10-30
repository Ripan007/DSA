package Day3;
// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
// wrong
public class ArraySort {
    public static void main(String[] args) {
        int arr[]= {0 ,2 ,1, 2, 0};
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
