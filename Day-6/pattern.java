package practice;

public class pattern {
    public static void main(String[] args) {
//     pattern(4) ;
//     pattern1(5);
//     pattern2(4);
//        pattern3(4);
        pattern4(6);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
     for(int i=1;i<=n;i++){
         for(int j=1;j<=n-i+1;j++){
             System.out.print("* ");
         }
         System.out.println();
     }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    static void pattern4(int n){
        for(int i=0;i<2*n;i++){
            int totalColInRow = i > n ? 2 * n - i : i;
            for(int j=0;j<totalColInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
