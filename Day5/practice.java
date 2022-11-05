package Day5;

public class practice {
    public static void main(String[] args) {
        int[] arr = {12,244,34,56,567};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] arr){
        int count = 0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
 static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
 }
 static int digits(int num){
        int count =0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;

 }
    }

