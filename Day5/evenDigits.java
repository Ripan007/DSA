package Day5;

public class evenDigits {
    public static void main(String[] args) {
int[] nums = {12,345,2,6,7896,67,56,89};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check if a number contains even digit or not
    static boolean even(int num){
int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in number
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
