public class sumDigit {
    public static void main(String[] args) {
        // sum of digit in a number
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
