package string;

public class letterTemplate {
    public static void main(String[] args) {
        String name = "best programming language is {}";
        name = name.replace("{}","java");
        System.out.println(name);
    }
}
