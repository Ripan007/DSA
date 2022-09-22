package string;

public class stringBuilder {
    public static void main(String[] args) {
StringBuilder sb = new StringBuilder("java");
//        System.out.println(sb.charAt(0));
//       sb.setCharAt(0,'p');
        sb.insert(0,"p");
        sb.delete(0,2);
        System.out.println(sb);



    }
}
