package day2;

public class stringSwap {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";

        // append a and b
        a = a+b; // helloworld

        // store initial string a in string b
        b = a.substring(0,a.length()-b.length()); // hello

        // store initial string b in string a
        a = a.substring(b.length());  // world

        System.out.println(a);
        System.out.println(b);
    }
}
