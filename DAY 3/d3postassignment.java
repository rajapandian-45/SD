import java.util.Scanner;

public class d3postassignment {
    Node head = null;
    Scanner sc = new Scanner(System.in);
    public void insertAtBeginning(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteFromBeginning() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
           head = null;
            return;

        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
       temp.next = null;
    }

    public void search(int key) {

        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) {
               System.out.println("Element found at position: " + pos);
                return;

            }

            temp = temp.next;

            pos++;
        }

        System.out.println("Element not found.");

    }



    public void display() {

        if (head == null) {

            System.out.println("List is empty.");

            return;

        }

        Node temp = head;

        System.out.print("List: ");

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;

        }

        System.out.println("NULL");

    }



    public static void main(String[] args) {

        d3postassignment list = new d3postassignment();

        Scanner sc = new Scanner(System.in);

        int choice;



        do {

            System.out.println("\nMenu:");

            System.out.println("1. Insert at Beginning");

            System.out.println("2. Insert at End");

            System.out.println("3. Delete from Beginning");

            System.out.println("4. Delete from End");

            System.out.println("5. Search");

            System.out.println("6. Display");

            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();



            int data;

            switch (choice) {

                case 1:

                    System.out.print("Enter data: ");

                    data = sc.nextInt();

                    list.insertAtBeginning(data);

                    break;

                case 2:

                    System.out.print("Enter data: ");

                    data = sc.nextInt();

                    list.insertAtEnd(data);

                    break;

                case 3:

                    list.deleteFromBeginning();

                    break;

                case 4:

                    list.deleteFromEnd();

                    break;

                case 5:

                    System.out.print("Enter element to search: ");

                    data = sc.nextInt();

                    list.search(data);

                    break;

                case 6:

                    list.display();

                    break;

                case 7:

                    System.out.println("Exiting program.");

                    break;

                default:

                    System.out.println("Invalid choice.");

            }



        } while (choice != 7);



        sc.close();

    }

}