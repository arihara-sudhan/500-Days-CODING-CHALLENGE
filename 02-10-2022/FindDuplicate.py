'''
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 02/10/2022
    @ Problem Statement : Find Duplicate
    Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    There is only one repeated number in nums, return this repeated number.
    You must solve the problem without modifying the array nums and uses only constant extra space.

    Example 1:
        Input: nums = [1,3,4,2,2]
        Output: 2
    
    Example 2:
        Input: nums = [3,1,3,4,2]
        Output: 3
'''

class Solution:
    def findDuplicate(self, nums):
        slow,fast = 0,0
        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow==fast:
                break
        slow2 = 0
        while True:
            slow2 = nums[slow2]
            slow = nums[slow]
            if slow==slow2:
                return slow