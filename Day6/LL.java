package Day6;
public class LL {
    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size =0;
    }
    private class Node{
        private int value;
        private Node next;

        // constructor

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    // insert at fast //
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next =head;
        head = node;
        if(tail==  null){
            tail = head;
        }
        size++;

    }

    // insert at last //
    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
// insert at particular index
    public void insertParticular(int value, int index){
    if(head == null){
        insertFirst(value);
    }


    }
    public void display(){
     Node temp = head;
     while(temp!=null){
         System.out.print(temp.value + "=>");
         temp = temp.next;
     }
        System.out.println("end");
    }

}
