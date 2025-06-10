public class d3task3 {
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

    void deleteAt(int pos) {
        if (head == null || pos <= 0) return;
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
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
        d3task3 list = new d3task3();
        list.insert(15);
        list.insert(25);
        list.insert(35);
        list.insert(45);

        list.print();           
        list.deleteAt(2);      
        list.print();        
        list.deleteAt(3);        
        list.print();            
    }
}
