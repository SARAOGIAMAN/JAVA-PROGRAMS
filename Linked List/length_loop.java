//find the length of the loop in a single linked list

package linked_list;
public class length_loop {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void push(int newdata)
	{
		Node node=new Node(newdata);
		node.next=head;
		head=node;
	}
	static int countnodes(Node n)
	{
		Node temp=n;
		int res=1;
		while(temp.next!=n)
		{
			res++;
			temp=temp.next;
		}
		return res;
	}
	public int detectloop()
	{
		Node slow=head,fast=head;
		int flag=0;
		while(slow!=null&&fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{	
				return countnodes(slow);
			}	
		}
		return 0;
	}
	public static void main(String[] args)
	{
		length_loop list=new length_loop();
		list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);
 
        /*Create loop for testing */
        list.head.next.next.next.next = list.head;
 
        System.out.println("Length of the loop is "+list.detectloop());
	}
}

    
