package linked_list;
public class detect_loop_in_ll {
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
	public void detectloop()
	{
		Node slow=head,fast=head;
		int flag=0;
		while(slow!=null&&fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{	
				flag=1;
		        break;
			}
		}
		if(flag==1)
			System.out.println("Loop found");
		else
			System.out.println("Loop not found");
	}
	public static void main(String[] args)
	{
		detect_loop_in_ll list=new detect_loop_in_ll();
		list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);
 
        /*Create loop for testing */
        //list.head.next.next.next.next = list.head;
 
        list.detectloop();
	}
}

    
