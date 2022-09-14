'''
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
'''

class ListNode(object):
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution(object):
    def __init__(self):
        a = ListNode(1)
        b = ListNode(2)
        c = ListNode(3)
        d = ListNode(4)
        a.next = b
        b.next = c
        c.next = d
        d.next = a #LOOP
        print(self.hasCycle(a))
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        slow = head; fast = head;
        while(fast!=None and fast.next!=None):
            slow = slow.next
            fast = fast.next.next
            if(slow==fast):
                return True
        return False

Solution()