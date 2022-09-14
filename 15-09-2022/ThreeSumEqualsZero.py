'''	
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 15/09/2022
	@ Problem Statement : Given an integer array nums, return True if the triplets 
	[nums[i], nums[j], nums[k]] exists such that i != j, i != k, and j != k, 
	and nums[i] + nums[j] + nums[k] == 0.
	@ Example :
		Input: nums = [-1,0,1,2,-1,-4]
		Output: True
		Explanation: 
		nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
		nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
		nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
		The distinct triplets are [-1,0,1] and [-1,-1,2].
'''

class Solution:
    def threeSum(self, nums):
        L = []
        nums = sorted(nums)
        for i in range(len(nums)-1):
            l = i+1; r=len(nums)-1
            while(l<r):
                if(nums[i]+nums[l]+nums[r]>0):
                    r-=1
                elif(nums[i]+nums[l]+nums[r]<0):
                    l+=1
                else:
                    return True
        return False
print(Solution().threeSum([1,2,-3]))
