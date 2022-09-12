/*
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 12/09/2022
	@ Problem Statement : Given an array of integers nums and an integer target,
	return indices of the two numbers such that they add up to target.
	You may assume that each input would have exactly one solution,
	and you may not use the same element twice.
	You can return the answer in any order.
	@ Example 1:
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
**/
import java.util.HashMap;
class Solution {
   	void twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x=0;x<nums.length;x++){
            if(map.containsKey(target-nums[x]))
                System.out.print("["+x+","+map.get(target-nums[x])+"]");
            else
                map.put(nums[x],x);
        }
    }
}
class TwoSum {
	public static void main(String[] args){
		new Solution().twoSum(new int[]{2,7,11,15},9);
	}
}