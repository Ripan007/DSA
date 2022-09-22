package LL;

public class middleInAll {
    public static void main(String[] args) {
        // find out the mid element
        LLNode head = LLUtils.takeInput();
        int midEle = getMidElement(head);
        System.out.println(midEle);


    }
    static int getMidElement(LLNode head){
        LLNode  slow = head;
        LLNode fast = head;
        while(fast!=null & fast.next !=null){
       slow = slow.next;
       fast = fast.next.next;
        }
        return slow.data;

    }

}
