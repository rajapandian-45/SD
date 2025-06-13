public class MainPro4 {
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
		 public  MainPro4() {
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
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		public void reversedisplay() {
		    if (head == null) 
		    	return;
		    Node temp = head;
		    while (temp.next != null) {
		        temp = temp.next;
		    }
		    while (temp != null) {
		        System.out.print(temp.data + " ");
		        temp = temp.prev;
		    }
		}
		 public static void main(String args[]) {
			 MainPro4 l=new  MainPro4();
			 l.insertAtBegin(60);
			 l.insertAtBegin(50);
			 l.insertAtBegin(40);
			 l.insertAtBegin(30);
			 l.insertAtBegin(20);
			 l.insertAtBegin(10);
			 l.insertAtBegin(777);
			 l.display();
			 System.out.println();
			 l.reversedisplay();
		 }
	}
