package Day3;

public class reverseString {
    public static void main(String[] args) {
        String name = "program";
        int len = name.length();
        String rev = " ";

        for(int i= len-1;i>=0;i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
