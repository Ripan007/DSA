package first_Day;

public class presentOrNot {
    public static void main(String[] args) {
        // write a program to find out whether a given integer is present in an array or not

        int[] marks = {20,45,67,89,23};
        int check = 21;

        boolean isInThere = false;

        for(int element:marks){
            if(check==element){
                isInThere = true;
                // no need to iterate again
                break;
            }
        }

        if(isInThere){
            System.out.println(" array is present");
        }else{
            System.out.println("array is absent");
        }
    }
}
