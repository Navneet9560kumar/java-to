package Linklist.LinklistRev.LLleetcodeQuestion;

import java.lang.classfile.components.ClassPrinter.ListNode;

class Node{
      int val;
      Node next;
      Node(int val){
            this.val = val;
            this.next = null;
      }
}



public class DeleteNodeinaLinkedList {
       public void deleteNode(Node node){
node.val = node.next.val;
node.next  = node.next.next;
       }
       public static void main(String[] args) {

       }
       }

