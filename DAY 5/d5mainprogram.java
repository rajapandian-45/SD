import java.util.Scanner;

public class d5mainprogram {


				Node last;
				
				class Node
				{
					int data;
			        Node next;
			public Node(int num)
					{
						data=num;
				        next=null;
				        
					}}

				public d5mainprogram() {
					last=null;
					
					
				}
				
				public void insert(int value)
				{
					Node newnode=new Node(value);
					if(last==null) {
						last=newnode;	
						last.next=newnode;
					}
					else
					{
						newnode.next=last.next;
						last.next=newnode;
					    last=newnode;;
					}
					
				}
				
				public void deleteAtHead() {
					
					Node head=last.next;
					if(last==head) {
						last=null;
					}
					else {
						last.next=head.next;
						
					}
					System.out.println("Deleted node: " + head.data);

					
					
				}
				public void deleteAtPosition() {
					Scanner s=new Scanner(System.in);
					Node head=last.next;
					int count=1;
					System.out.println("Enter the position to delete");
					int pos=s.nextInt();
					if(last ==null) {
						System.out.println("List is empty");
						
						
					}
					if(pos == 1)
					{
						deleteAtHead();
						return;
					}
					Node temp=head;
					
					while(count < pos -1 && temp.next != head ) {
						temp=temp.next;
						count++;
					}
					if(temp.next ==last) {
						 System.out.println("Deleted"+temp.next.data);
						 temp.next=last.next;
						 last=temp;
					}
					else {
						System.out.println("Deleted:"+temp.next.data);
						temp.next=temp.next.next;
						
					}
					
					
				}
			
				public void display() {
					Node temp=last.next;
					do{
						System.out.println(temp.data + " ");
						temp=temp.next;
						
					}while(temp!=last.next);
				}
				public static void main(String []args) {
					d5mainprogram t=new d5mainprogram();
					
					
					t.insert(5);
					t.insert(4);
					t.insert(3);
					t.insert(2);
					t.display();
					System.out.println("After deletion");
					
					t.deleteAtPosition();
					t.display();
					
				}



}

