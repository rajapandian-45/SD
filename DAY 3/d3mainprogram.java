public class d3mainprogram {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    } 
    Node head;
    
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    void reverse() {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current;       
            current = next;    
        }
        head = prev; 
    }
    void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        d3mainprogram list = new d3mainprogram();
        list.insert(15);
        list.insert(25);
        list.insert(35);
        list.insert(45);
        System.out.println("Original list:");
        list.print();       
        list.reverse();
        System.out.println("Reversed list:");
        list.print();     
    }
}
