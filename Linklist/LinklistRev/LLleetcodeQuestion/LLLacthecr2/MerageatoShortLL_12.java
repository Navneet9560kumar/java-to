package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

class Node{
      int val;
      Node next;
      Node(int val){
            this.val= val;
            this.next = null;
      }
}

public class MerageatoShortLL_12 {

      public Node mergeTwoLists(Node list1, Node list2){
            Node dummy = new Node(100);
          
            Node temp= dummy;
            Node temp1 = list1;
            Node temp2 = list2;
            while (temp1!=null && temp2!=null) {
                  if(temp1.val<= temp2.val){
                        temp.next = temp1;
                        temp = temp.next;
                        temp1 = temp1.next;

                  }
                  else{
                        temp.next = temp2;
                        temp2 = temp2.next;
                  }
                  temp = temp.next;
            }
            if(temp1== null) temp.next = temp2;
            else temp.next = temp1;
            return dummy.next;
      }
      public static void main(String[] args) {
            
      }
}
