package second_Day;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       String new_str = str;
       String rev = "";
       int len = str.length();

       for(int i=len-1;i>=0;i--){
           rev = rev + str.charAt(i);
       }

       if(new_str.equals(rev)){
           System.out.println("it is a palindrome string");
       }else{
           System.out.println("it is not a palindrome string");
       }


    }
}
