package day2;

public class kthSmallest {
    public static void main(String[] args) {
        int arr[] = {7 ,10, 4 ,3 ,20, 15};
        int k = 3;
        for(int i=0;i<arr.length;i++){
            for(int j= i+1;j< arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i==k-1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
