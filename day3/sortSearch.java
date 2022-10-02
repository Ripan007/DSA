import java.util.*;

public class sortSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];

        // take input

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // search number and print index

        int x = s.nextInt();
        int i = 0;
        int j = arr[0].length - 1;

        // while loop

        while (i < arr.length && j >= 0) {
            if (x == arr[i][j]) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (x < arr[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("num not found");
    }

}
