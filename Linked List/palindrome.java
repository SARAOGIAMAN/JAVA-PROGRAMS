//to check whether the given linked list is palindrome or not

package linked_list;
import java.util.Stack;
public class palindrome {
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
	public static boolean ispalindrome()
	{
		Node temp=head;
		Stack<Integer> s=new Stack<Integer>();
		while(temp!=null)
		{
			s.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null)
		{
			if(temp.data!=s.pop())
				return false;
			temp=temp.next;
		}
		return true;
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
		palindrome list=new palindrome();
		list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.println("Given linked list is ");
        list.print();
        System.out.println("Palindrome ===== "+ispalindrome());
	}
}

    
