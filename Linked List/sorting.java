//PROGRAM TO SORT A LINKED LIST IN ASCENDING ORDER

package linked_list;

public class sorting {
static Node head;
static class Node{
	int data;
	Node next;
	Node (int d)
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
void sort()
{
	Node a=head,b=null;
	int temp;
	if(head==null)
		return;
	else {
	while(a.next!=null)
	{
		b=a.next;
		while(b!=null)
		{
		if(a.data>b.data)
		{
			temp=a.data;
			a.data=b.data;
			b.data=temp;
		}
		b=b.next;
	}
		a=a.next;
}
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
}
public static void main(String[] args)
{
	sorting list=new sorting();
	list.push(5);
	list.push(1);
	list.push(6);
	list.push(2);
	list.push(9);
	list.push(3);
	System.out.println("Given linked list");
	list.print();
	System.out.println();
	System.out.println("After sorting");
	list.sort();
	list.print();	
}
}


