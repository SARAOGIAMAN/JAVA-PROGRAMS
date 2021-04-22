package linked_list;

import linked_list.insert_at_end.Node;

public class insert_at_end {
	
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
	public void insertAtEnd(int data)
	 {
		 Node node=new Node(data);
		 node.data=data;
		 node.next=null;
		 if(head==null)
		 {
			 head=node;
		 }
		 else
		 {
			 Node last=head;
			 while(last.next!=null)
			 {
				 last=last.next;
			 }
			 last.next=node;
		 }
	 }
	void push(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
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
		insert_at_end list=new insert_at_end();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		System.out.println("Given linked list ");
		list.print();
		list.insertAtEnd(9);
		System.out.println("New Linked List ");
		list.print();
	}
}