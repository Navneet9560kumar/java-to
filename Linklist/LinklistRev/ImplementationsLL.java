package Linklist.LinklistRev;

class Node {
    int val;      // Har node ke andar ek integer value store hogi
    Node next;    // 'next' pointer jo next node ko point karega


    Node(int val) {
        
        this.val = val;    // Constructor ke through value assign hoti hai
        this.next = null;  // Jab naya node banta hai to initially uska next null hota hai 
    }
}

class SLL { // Singly Linked List
    Node head;
    Node tail;
    int size;

    //insert at postion 
     void insert(int idx, int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        
          if(idx==size){
            insertAtEnd(val);
            return;
        }
           if(idx>size){
          System.out.println("Inveled index");
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1;i<=idx-1;i++){
            x= x.next;
        }
        temp.next = x.next;
        x.next  =temp;
        size++;
     }

    // Insert at end
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++; // size update karna zaruri hai
    }


    //  deleteAtHead()
  void deleteAtHead(){
    if(head== null) throw new Error("List is Empty");
    head = head.next;
    size--;
  }

  //deleteAtTail()
  void deleteAtTail() throws Error{
if (head == null) throw new IllegalStateException("List is Empty");

if(size==1) {
  head = tail = null;
} else {
  Node temp = head;
  while(temp.next != tail) {
    temp = temp.next;
  }
  temp.next = null;
  tail = temp;
  size--;


}
}

// insert at head
void insertAtHead(int val){
    Node temp = new Node(val);
    if(head == null){
            head=tail=temp;
        }else{
            temp.next = head;
            head = temp;
        } 
        size++; // size update karna zaruri hai
    }

    // get element
    int get(int idx){
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            System.out.println("Invalid Index");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i <= idx; i++) {
            temp = temp.next;

        }
        return temp.val;
    }

    // set function
      // get element
    void set(int idx, int val){
        if(idx==size-1) tail.val = val;
        if(idx>=size || idx<0){
            System.out.println("Invalid Index");
        
        }
        Node temp = head;
        for (int i = 0; i <= idx; i++) {
            temp = temp.next;

        }
       temp.val = val;
    }
    // Display linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    // Print size of list
    void printSize() {
        System.out.println("Length of Linked List: " + size);
    }
}

public class ImplementationsLL {

    public static void main(String[] args) {
        SLL list = new SLL();

        list.printSize(); // initially 0

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();

        list.insertAtEnd(24);
        list.display();

        list.insertAtEnd(55);
        list.insertAtEnd(60);
        list.insertAtEnd(13);
        list.insertAtEnd(44);

        list.printSize(); // final size
    }
}
