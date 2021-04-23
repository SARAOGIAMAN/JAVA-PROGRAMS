package linked_list;

public class insert_at_index {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			next=null;
			data=d;
		}
		}
	void push(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	public void insertAtStart(int data)
	 {
		 Node node=new Node(data);
		 node.data=data;
		 node.next=null;
		 node.next=head;
		 head=node;
	 }

	
	 public void insertAt(int index,int data)
	 {
		 Node node=new Node(data);
		 node.data=data;
		 node.next=null;
		 if(index==0)
		 {
			 insertAtStart(data);
		 }
		 else 
		 {
			 Node n=head;
			 for(int i=0;i<index-1;i++)
			 {
				 n=n.next;
			 }
			 node.next=n.next;
			 n.next=node;
		 }
	 }
	static void print()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		insert_at_index list=new insert_at_index();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		System.out.println("Given linked list ");
		list.print();
		list.insertAt(2,9);
		System.out.println("New Linked List ");
		list.print();
	}
}