//Program to delete last node from a single linked list

package linked_list;

public class delete_last_node {
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
void delete_last()
{
	if(head==null)
	{
		System.out.println("List is Empty ");
	}
	else
	{
	Node second_last=head;
	while(second_last.next.next!=null)
	{
		second_last=second_last.next;
	}
	second_last.next=null;
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
	delete_last_node list=new delete_last_node();
	list.push(1);
	list.push(2);
	list.push(3);
	list.push(4);
	System.out.println("Given linked list ");
	list.print();
	list.delete_last();
	System.out.println("New linked list ");
	list.print();
}
}
