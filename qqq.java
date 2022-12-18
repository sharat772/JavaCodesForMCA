import java.io.BufferedReader;
import java.util.Scanner;

class qqq
{
	Node head; 

	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	void removeDuplicates()
	{
		Node curr = head;
		while (curr != null) {
			Node temp = curr;
			while(temp!=null && temp.data==curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}
					
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		qqq llist = new qqq();
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] splited = s.split(" ");
        for(int i=0;i<splited.length;i++){
            int nodes=Integer.parseInt(splited[i]);
            llist.push(nodes);
        }
		llist.removeDuplicates();
		llist.printList();
	}
}
	

