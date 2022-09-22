package LL;

public class reverseAll {
    public static void main(String[] args) {
        LLNode head = LLUtils.takeInput();
        LLNode reverseHead = reverse(head);
        LLUtils.print(reverseHead);

    }
    static LLNode reverse(LLNode head){
        LLNode prev = null;
        LLNode curr = head;
        while(curr!=null){
            LLNode agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;

        }
        return prev;

    }
}
