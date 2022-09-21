/*
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 20/09/2022
    @ Problem Statement :  Given the head of a singly linked list, group all the nodes with odd indices
    together followed by the nodes with even indices, and return the reordered list.
    The first node is considered odd, and the second node is even, and so on.
    Note that the relative order inside both the even and odd groups should remain as it was in the input.
    You must solve the problem in O(1) extra space complexity and O(n) time complexit
    Example : 
        Input: head = [2,1,3,5,6,4,7]
        Output: [2,3,6,7,1,5,4]
*/

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class OddEvenLinkedList {
    static ListNode oddEvenList(ListNode head) {
        if (head==null)
            return null;
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode evenHeadNode = head.next;
        while(evenNode!=null && evenNode.next!=null){
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;
            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenHeadNode;
        return head;
    }
    public static void main(String[] args){
        ListNode first0 = new ListNode(1);
        ListNode first1 = new ListNode(2);
        ListNode first2 = new ListNode(3);
        ListNode first3 = new ListNode(4);
        ListNode first4 = new ListNode(5);
        ListNode first5 = new ListNode(6);
        first0.next = first1;
        first1.next = first2;
        first2.next = first3;
        first3.next = first4;
        first4.next = first5;
        first5.next = null;
        ListNode oddEvenLinkedList_Head = oddEvenList(first0);
        while (oddEvenLinkedList_Head!=null){
            System.out.print(oddEvenLinkedList_Head.val+"->");
            oddEvenLinkedList_Head = oddEvenLinkedList_Head.next;
        }
        System.out.print("NULL");
    }
}