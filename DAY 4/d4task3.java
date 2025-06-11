public class d4task3 {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    public static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void deleteMiddle() {
        if (head == null || head.next == null) {
            System.out.println("List too short to delete middle.");
            head = null;
            return;
        }

        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        if (prev != null) {
            prev.next = slow.next;
            System.out.println("Deleted middle node: " + slow.data);
        }
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        System.out.println("Original list:");
        display();
        deleteMiddle();
        System.out.println("After deleting middle node:");
        display();
    }
}
