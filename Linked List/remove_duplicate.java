package linked_list;
//the linked list should be in sorted order

public class remove_duplicate {
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
void removeduplicate()
{
	Node curr=head;
	while(curr!=null)
	{
		Node temp=curr;
		while(temp!=null&&temp.data==curr.data)
		{
			temp=temp.next;
		}
		curr.next=temp;
		curr=curr.next;
	}
}
public void push(int data)
{
	Node node=new Node(data);
	node.next=head;
	head=node;
}
public void print()
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
	remove_duplicate node=new remove_duplicate();
	node.push(3);
	node.push(3);
	node.push(3);
	node.push(2);
	node.push(2);
	node.push(2);
	node.push(1);
	node.push(1);
	System.out.println("Given linked list");
	node.print();
	node.removeduplicate();
	System.out.println();
	System.out.println("After removing");
	node.print();
}

}


