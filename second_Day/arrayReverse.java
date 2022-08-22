package second_Day;

import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rev = 0;

    while(num!=0){
        rev = rev * 10 + num%10;
        num = num/10;
    }
        System.out.print("the reverse of the array is"+" "+ rev);
    }
}
