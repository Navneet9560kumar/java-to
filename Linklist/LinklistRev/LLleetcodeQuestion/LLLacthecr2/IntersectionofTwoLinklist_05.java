package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
     }
 }


 
public class IntersectionofTwoLinklist_05 {

       public Node getIntersectionNode(Node headA, Node headB){
      //calacute a lenA and lenB
      int lenA=0, lenB=0;
      Node tempA= headA;
      Node tempB= headB;

      while (tempA!=null) {
            tempA = tempA.next;
            lenA++;
      }

      while (tempB!=null) {
            tempB = tempB.next;
            lenB++;
      }

      if(lenA>lenB){
         for(int i=1;i<=lenA-lenB;i++){
            tempA = tempA.next;
         }
      }else{
         for(int i=1;i<=lenB-lenA;i++){
            tempB = tempB.next;
         }
         while (tempA !=tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
         }
        
      }
      return tempB;
  }
      public static void main(String[] args) {
            
      }
}
