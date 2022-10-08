public class count {
    public static void main(String[] args) {
        // count number of digit
        int num = 12345885;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }

}
