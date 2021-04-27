//Program to find the length of a single linked list

package linked_list;

public class length_linkedList {
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
public int recursivelen(Node node)
{
	 if(node==null)
		 return 0;
	 return 1 + recursivelen(node.next);
}
public int getcount()
{
	 return recursivelen(head);
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
	length_linkedList list=new length_linkedList();
	list.push(1);
	list.push(2);
	list.push(3);
	list.push(4);
	System.out.println("Given linked list ");
	list.print();
    System.out.println("Length of the linked list is "+list.getcount()); 
}
}