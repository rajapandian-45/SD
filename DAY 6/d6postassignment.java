class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty! Cannot pop.");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Top element is: " + top.data);
    }
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.print("Stack (top to bottom): ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class d6postassignment {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();   

        stack.peek();     

        stack.pop();     
        stack.display();  
    }
}
