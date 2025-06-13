public class d4task3 {
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
		 public  d4task3() {
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
		public void deleteinMiddle() {
		    if (head == null) {
		        System.out.println("List is empty, nothing to delete.");
		        return;
		    }
		    Node slow = head;
		    Node fast = head;
		    while (fast != null && fast.next != null) {
		        slow = slow.next;
		        fast = fast.next.next;
		    }
		    Node prevNode = slow.prev;
		    Node nextNode = slow.next;
		    if (prevNode == null) {
		        head = nextNode;
		        if (head != null) {
		            head.prev = null;
		        }
		    } else {
		        prevNode.next = nextNode;
		        if (nextNode != null) {
		            nextNode.prev = prevNode;
		        }
		    }
		    slow.next = null;
		    slow.prev = null;
		    System.out.println("Deleted middle node with value: " + slow.data);
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
			 d4task3 l=new  d4task3();
			 l.insertAtBegin(60);
			 l.insertAtBegin(50);
			 l.insertAtBegin(40);
			 l.insertAtBegin(30);
			 l.insertAtBegin(20);
			 l.insertAtBegin(10);
			 l.insertAtBegin(777);
			 l.display();
			 System.out.println();
			
			 l.deleteinMiddle();
			 l.display();
		 }
}
