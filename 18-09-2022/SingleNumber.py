'''
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 18/09/2022
    @ Problem Statement : Given a non-empty array of integers nums, 
    every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and 
    use only constant extra space.
 
'''

class SingleNumber:
    def singleNumber(self, nums):
        if len(nums)==1:
            return nums[0]
        d = {}
        for x in nums:
            if x in d:
                d[x]+=1
            else:
                d[x]=1
        for x in d:
            if d[x]==1:
                return x
        return None
print(SingleNumber().singleNumber([1,2,3,4,1,2,3]))