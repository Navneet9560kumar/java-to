package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

public class RemoveThenthNode_03{

      class Node{
            int val;
            Node next;
            Node(int val){
                  this.val = val;
                  this.next = null;
            }
      }

         public Node removeNthFromEnd(Node head, int n){
                  Node temp = head;
                  int len= 0;
                  while (temp!=null) {
                       temp = temp.next;
                           len++; 
                  }


                  if(len==1)return null;
                  //nth from end = len - n + 1 from start
                  temp = head;
                  for(int i=1; i<= len - n; i++){
                        temp = temp.next;
                  }
                  //delection
                  temp.next = temp.next.next;
                  return head;
         }
      public static void main(String[] args) {
            
      }
}
