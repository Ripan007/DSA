package Day4;

public class linearSearch {
    public static void main(String[] args) {
     int[] num  = {10,20,30,40,50};
     int target = 51;
//        System.out.println(search(num,target));
      //  System.out.println(search1(num,target));
        System.out.println(search2(num,target));
    }
//    static int search(int[] num , int  target){
//        if(num.length==0){
//            return -1;
//        }
//        static int search1(int[] num , int  target){
//            if(num.length==0){
//                return -1;
//            }


//        for(int i=0;i<num.length;i++){
//            if(num[i] ==target){
//                return i;
//            }
//        }
//        return -1;
// enhanced forLoop
//         for(int element:num){
//             if(element==target){
//                 return element;
//             }
//         }
//         return -1;
//    }

    static boolean search2(int[] num , int target){
        if(num.length==0){
            return false;
        }

       for(int element:num){
           if(element==target){
               return true;
           }
       }
       return false;
    }


}
