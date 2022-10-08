package day2;

public class stringReverse {
    public static void main(String[] args) {
        String name = "awesome";
        int length = name.length();
        String rev = "";

        for(int i= length-1;i>=0;i--){
            rev  = rev + name.charAt(i);
        }
        System.out.print(rev);
    }
}
