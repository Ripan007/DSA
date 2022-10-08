public class countEvenOdd {
    public static void main(String[] args) {
        // count even and odd number
        int num = 1234561111;
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }

}
