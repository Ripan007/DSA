package Day3;
//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
public class KthSmallest {
    public static void main(String[] args) {
        // kth largest element
        int[] arr = {7, 10, 4 ,3, 20 ,15};
        int k = 4;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]< arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i==k-1){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
