package second_Day;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int num = sc.nextInt();
 int original_num = num;
 int rev =0;

 while(num!=0){
     rev = rev * 10+ num%10;
     num = num/10;
 }
 if(original_num==rev){
     System.out.println("it is a palindrome number");
 }else{
     System.out.println("not a palindrome number");
 }

    }
}
