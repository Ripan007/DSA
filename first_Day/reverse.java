package first_Day;
// reverse an array
public class reverse {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int l = arr.length;
        int mid = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<mid;i++){
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }

        for(int element:arr){
            System.out.print(element+" ");
        }

    }
}
