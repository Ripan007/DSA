package Day5;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,9,10};
        int target =  2;
        System.out.println(searchRange(arr,target,1,4));

    }
    static int searchRange(int[] arr , int target, int start , int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start ;i <=end;i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
