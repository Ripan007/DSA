package Day4;

public class searchInStrings {
    public static void main(String[] args) {
        String text = "java";
        char target = 'p';
      //  System.out.println(search(text,target));
        System.out.println(search1(text,target));

    }

    static boolean search(String text , char target){
        if(text.length()==0){
            return false;
        }
        for(int i=0;i<text.length();i++){
            if(target ==text.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search1(String text , char target){
        if(text.length()==0){
            return false;
        }
        for(char  ch:text.toCharArray()){
            if(ch ==target){
                return true;
            }
        }
        return false;
    }
}
