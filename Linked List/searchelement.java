//search an element in a linked list

package linked_list;

public class searchelement {
	static Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	void push(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	void search(int temp)
	{
		Node n=head;
		while(n!=null)
		{
			if(n.data==temp)
			{
				System.out.println("Search successful ");
				break;
			}
			n=n.next;
		}
	}
	void print()
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
		searchelement list=new searchelement();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		System.out.println("Linked list is ");
		list.print();
		list.search(4);
	}
}
