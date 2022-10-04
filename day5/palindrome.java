public class palindrome {
    public static void main(String[] args) {
        // a number is palindrome or not
        int num = 16461;
        int rev = 0;
        int original = num;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (original == rev) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

}
