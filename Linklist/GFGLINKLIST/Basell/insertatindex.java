package Linklist.GFGLINKLIST.Basell;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class insertatindex {

    static Node head = null;
    static Node tail = null;
    static int size = 0;

    // Insert at Head
    public static void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // Insert at any index
    public static void insert(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        // insert at head
        if (idx == 0) {
            insertAtHead(val);
            return;
        }

        // insert at tail
        if (idx == size) {
            Node temp = new Node(val);
            tail.next = temp;
            tail = temp;
            size++;
            return;
        }

        // insert in middle
        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Print list
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        
    }

    public static void delete(int idx){
      Node temp = head;
      for(int i=1;i<idx-1;i++){
        temp = temp.next;
      }
      temp.next = temp.next.next;
      if(idx==size-1){
        tail = temp;
      }
      temp.next = temp.next.next;
      if(idx==size-1) tail = temp;
      size--;

    public static void main(String[] args) {
        insertAtHead(10);
        insertAtHead(5);
        insert(20, 2);   // insert at index 2
        insert(7, 1);    // insert at index 1

        printList();
    }
}
}
