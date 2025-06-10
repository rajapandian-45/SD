public class d3task2 {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
    
    Node head;
    void insertAt(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
    public static void main(String[] args) {
        d3task2 list = new d3task2();
        list.insertAt(10, 1);
        list.insertAt(20, 2);
        list.insertAt(15, 3);
        list.print();
    }
}
