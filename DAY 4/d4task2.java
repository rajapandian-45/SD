public class d4task2 {
		Node head;
		class Node
		{
		 int data;
		 Node next;
		 Node prev;
		 Node(int val)
		 {
			 data=val;
			 next=null;
			 prev=null;
		 }
		}
		 public  d4task2() {
			head =null;
	   }
		public void insertAtBegin(int val)
		{
			Node newNode =new  Node(val);
			if(head==null)
			{
				head=newNode;
			}
			else
			{
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}
		}
		public void insertInMiddle(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node slow = head;
	        Node fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        Node prevNode = slow.prev;
	        newNode.next = slow;
	        newNode.prev = prevNode;
	        slow.prev = newNode;
	        if (prevNode != null) {
	            prevNode.next = newNode;
	        } else {
	            head = newNode;
	        }
	    }
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}	
		}
		 public static void main(String args[]) {
			 d4task2 l=new  d4task2();
			 l.insertAtBegin(60);
			 l.insertAtBegin(50);
			 l.insertAtBegin(40);
			 l.insertAtBegin(30);
			 l.insertAtBegin(20);
			 l.insertAtBegin(10);
			 l.insertAtBegin(777);
			 l.display();
			 System.out.println();
			 System.out.println("After inserting 555 in the middle:");
			 l.insertInMiddle(555);
			 l.display();
		 }
	}
