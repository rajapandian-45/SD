public class d4task2 {

    private Node head;
    private int size = 0;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {

            head = newNode;
        } else {
            Node cur = head;

            while (cur.next != null) cur = cur.next;
            cur.next = newNode;
            newNode.prev = cur;
        }
        size++;
    }
    class Node {
        int data;
        Node prev, next;
        Node(int data) { this.data = data; }
    }

    public void insertMiddle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            int mid = (size % 2 == 0 ? size / 2 : (size + 1) / 2);
            Node cur = head;
            for (int i = 1; i < mid; i++) {
                cur = cur.next;
            }         
            newNode.next = cur.next;
            newNode.prev = cur;
            
            if (cur.next != null) cur.next.prev = newNode;
            cur.next = newNode;
        }
        size++;
    }

    public void traverseForward() {
        Node cur = head;
        System.out.print("Forward: ");
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        d4task2 dll = new d4task2();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        System.out.println("Before insertion:");
        dll.traverseForward(); 
        dll.insertMiddle(25);

        System.out.println("After insertion in middle:");
        dll.traverseForward();  

    }
}

