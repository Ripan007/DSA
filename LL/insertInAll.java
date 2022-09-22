package LL;

public class insertInAll {
    public static void main(String[] args) {
LLNode head = LLUtils.takeInput();
LLNode newHead1 = insert(head,0,8);
LLUtils.print(newHead1);
LLNode newHead2 = insert(head,4,10);
LLUtils.print(newHead2);
LLNode newHead3 = insert(head,6, 34);
LLUtils.print(newHead3);

    }
    // insert element at 0 indx
    static LLNode insert(LLNode head, int idx , int el){

  if(idx==0){
      LLNode newNode = new LLNode(el);
      newNode.next = head;
      head = newNode;
      return head;
        }
  // insert element at 4 idx
  LLNode newNode  = new LLNode(el);
  int i =0;
LLNode prevNode = head;
while(i<idx-1){
    prevNode =prevNode.next;
    i++;
}
LLNode nextNode = prevNode.next;
newNode.next = nextNode;
prevNode.next = newNode;
return  head;

    }

}

