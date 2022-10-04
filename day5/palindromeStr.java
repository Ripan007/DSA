public class palindromeStr {
    public static void main(String[] args) {
        // check string palindrome
        String str = "madam";
        String ori = str;
        int len = str.length();
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
