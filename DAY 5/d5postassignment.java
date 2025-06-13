import java.util.Scanner;

public class d5postassignment {

    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    static Node last = null;

    public static void insert(int value) {
        Node newNode = new Node(value);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public static void deleteAtPosition(int pos) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node head = last.next;

        if (pos == 0) {
         
            if (last == head) {
                System.out.println("Deleted: " + head.data);
                last = null;
            } else {
                System.out.println("Deleted: " + head.data);
                last.next = head.next;
            }
            return;
        }

        Node temp = head;
        int count = 0;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (temp.next == head || temp.next == null) {
            System.out.println("Invalid position.");
            return;
        }

        if (temp.next == last) {
            System.out.println("Deleted: " + last.data);
            temp.next = last.next;
            last = temp;
        } else {
            System.out.println("Deleted: " + temp.next.data);
            temp.next = temp.next.next;
        }
    }

    public static void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = last.next;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value, pos;

        do {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete at position");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    insert(value);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();
                    deleteAtPosition(pos);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
