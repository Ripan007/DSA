package first_Day;

public class sum {
    public static void main(String[] args) {
        // create an array of 5 float and calculate their sum
        float marks[] = {50f,34f,25f,56f,90f};
        float sum = 0;
        //for-each loop
        for( float element:marks){
         sum+=element;
        }
        System.out.print("the total sum of element is:"+" "+ sum);
    }
}
