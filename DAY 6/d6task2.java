import java.util.Scanner;

public class d6task2 {
    int mystack[] = new int[5];
    int top = -1;

    public void push(int num) {
        if (top == mystack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            mystack[++top] = num;
            System.out.println(num + " pushed to stack");
        }  
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(mystack[i] + " ");
            }
            System.out.println();
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(mystack[top] + " popped from stack");
            top--;
        }
    }

    public void peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + mystack[top]);
        }
    }

    public static void main(String[] args) {
        d6task2 stack = new d6task2();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int value;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}		