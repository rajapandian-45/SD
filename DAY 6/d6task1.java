public class d6task1 {
	int mystack[] = new int[5];
	int top = -1;
	
	public void push(int num) {
		if((top==4)) {
			System.out.println(" Stack Overflow ");
			}
		else {
			mystack[++top]=num;
		}
	}
		public void display() {
			for(int i=0;i<mystack.length;i++)
			{
			System.out.print(mystack[i]+" ");
			}
		}
		public void pop() {
			
			if(top<0)
			{
				System.out.println("stack error");
			}
			else {	
			System.out.println(" " +mystack[top] + " popped stack");
			top--;
			}
		}
		
		public void peek() {

			if(top<0)
			{
				System.out.println("stack error");
			}
			else {	
			System.out.println(" top element is: " + mystack[top]);
		}
		}
		
		public static void main(String[] args) {
	        d6task1 stack = new d6task1();
	        
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.display();	        
	        stack.peek();
	        
	        stack.pop();
	        stack.display();	        
	        stack.push(40);
	        stack.push(50);
	        stack.push(60); 
	        stack.display();        
	        stack.pop();
	        stack.peek();
	    }
	}
	



