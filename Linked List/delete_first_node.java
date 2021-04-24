//Program to delete first node from a single linked list
package linked_list;

public class delete_first_node {
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
void delete_first()
{
	head=head.next;
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
	delete_first_node list=new delete_first_node();
	list.push(1);
	list.push(2);
	list.push(3);
	list.push(4);
	System.out.println("Given linked list ");
	list.print();
	list.delete_first();
	System.out.println("New linked list ");
	list.print();
}
}
