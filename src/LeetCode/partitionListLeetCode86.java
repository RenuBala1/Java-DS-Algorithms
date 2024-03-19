package LeetCode;



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class partitionListLeetCode86 {
	public static ListNode partition(ListNode head, int x) {

		ListNode smallerListHead=null;
		ListNode smallerListTail=null;
		ListNode greaterListHead=null;
		ListNode greaterListTail=null;

		while(head!=null)
		{
			if(head.val<x)
			{
				if(smallerListHead==null) 
				{
					smallerListHead=smallerListTail=head;
				}
				else
				{
					smallerListTail.next=head;
					smallerListTail=head;
				}
			}
			else 
			{
				if(greaterListHead==null) 
				{
					greaterListHead=greaterListTail=head;
				}
				else
				{
					greaterListTail.next=head;
					greaterListTail=head;

				}
			}
			head=head.next;
		}

		if(greaterListTail!=null)
		{
			greaterListTail.next=null;
		}

		if(smallerListHead==null)
		{

			return greaterListHead;
		}

		smallerListTail.next=greaterListHead;

		return smallerListHead;

	}
}
