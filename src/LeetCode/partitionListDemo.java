package LeetCode;

public class partitionListDemo {

	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(4);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(2);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(2);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		
		ListNode.printList(node1);
		
		ListNode head=partitionListLeetCode86.partition(node1, 3);
		
		ListNode.printList(head);
		
		

	}

}
