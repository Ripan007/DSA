package first_Day;

public class average {
    // calculate the average marks of the student
    public static void main(String[] args) {
        int[] marks = {20,30,45,79};
        int sum =0;

        for(int element : marks) {
            sum = sum + element;
        }

        System.out.println("the average marks of the student is "+sum/ marks.length);
    }
}
