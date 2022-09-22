package LL;

import java.util.Scanner;

public class LLUtils {
    public static void main(String[] args) {
        LLNode head = takeInput();
        print(head);


    }
    static LLNode takeInput(){
        Scanner  sc = new Scanner(System.in);
        int data = sc.nextInt();
        LLNode head =  null;
        LLNode tail =  null;

        while(data != -1){
            LLNode newNode = new LLNode(data);
            if(head==null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;

    }
    static void print(LLNode head){
        LLNode  temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
