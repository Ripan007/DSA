package first_Day;

public class maximum {
    public static void main(String[] args) {
        int[] arr = {23,56,78,45};
        int max = 0;

        for(int element:arr){
            if (element> max){
              max = element;
            }
        }
        System.out.println("the maximum element is "+""+max);
    }
}
