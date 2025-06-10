package DSA;

public class task1{
    private int[] arr;
    private int size;  
    public task1(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public boolean insert(int index, int element) {
        if (size == arr.length) {
            System.out.println("Array is full, cannot insert.");
            return false;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return false;
        }
        
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        size++;
        return true;
    }

    
    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return false;
        }
        
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return true;
    }

   
    public boolean update(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return false;
        }
        arr[index] = element;
        return true;
    }

    
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task1 arrayOps = new task1(5);

        arrayOps.insert(0, 10);
        arrayOps.insert(1, 20);
        arrayOps.insert(2, 30);
        arrayOps.display();  

        arrayOps.insert(1, 15);
        arrayOps.display();  

        arrayOps.update(2, 25);
        arrayOps.display();  
        arrayOps.delete(3);
        arrayOps.display();  
    }
}
