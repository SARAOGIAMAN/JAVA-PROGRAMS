public class insertion {
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
		insertion list=new insertion();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		System.out.println("Given linked list ");
		list.print();
	}
}
