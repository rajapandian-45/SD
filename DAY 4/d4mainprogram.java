public class d4mainprogram {

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class DLL {
        Node head;
        Node tail;

        public DLL() {
            head = null;
            tail = null;
        }
        public void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        public void traverseFromFront() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println(); 
        }
    public static void main(String[] args) {
        DLL list = new DLL();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.print("Traversal from front to back: ");
        list.traverseFromFront();

    }
    }
}

