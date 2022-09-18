'''
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 18/09/2022
    @ Problem Statement : Given an array nums of size n, return the majority element. 
'''

class Majority:
    def majorityElement(self, nums):
        max,key = -1,-1
        d = {}
        for x in nums:
            if x in d:
                d[x]+=1
            else:
                d[x]=1
            if d[x]>max:
                max = d[x]
                key = x
        return key
print(Majority().majorityElement([1,2,3,4,4,4,4]))