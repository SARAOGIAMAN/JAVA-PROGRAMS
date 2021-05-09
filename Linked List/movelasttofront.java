//Moving the last element to the front in the linked list

package linked_list;

public class movelasttofront {
static Node head;
static class Node{
	Node next;
	int data;
	Node(int d)
	{
		data=d;
	}
}
void push(int data)
{
	Node node=new Node(data);
	node.next=head;
	head=node;
}
void move()
{
	if(head==null)
		return;
	else
	{
		Node seclast = null;
        Node last = head;
		while(last.next!=null)
		{
			seclast=last;
			last=last.next;
	}
		seclast.next=null;
		last.next=head;
		head=last;
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
	movelasttofront list=new movelasttofront();
	list.push(5);
	list.push(1);
	list.push(6);
	list.push(2);
	list.push(9);
	list.push(3);
	System.out.println("Given linked list");
	list.print();
	System.out.println();
	System.out.println("After moving");
	list.move();
	list.print();	
}
}



