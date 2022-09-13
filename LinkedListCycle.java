/*	
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 13/09/2022
	@ Problem Statement : Given head, the head of a linked list, 
	determine if the linked list has a cycle in it.
	There is a cycle in a linked list if there is some node
	in the list that can be reached again by continuously 
	following the next pointer. 
	Internally, pos is used to denote the index of the node that 
	tail's next pointer is connected to. Note that pos is not passed as a parameter.
	Return true if there is a cycle in the linked list. Otherwise, return false.
**/

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
class Solution {
    boolean hasCycle(ListNode head) {
      ListNode slow = head,fast = head;
      while(slow!=null&&fast!=null){
          slow = slow.next;
          fast = fast.next.next;
          if(slow==fast)
              return true;
      }
      return false;
    }
}
class LinkedListCycle {
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = a;
		System.out.println(new Solution().hasCycle(a));
	}
}