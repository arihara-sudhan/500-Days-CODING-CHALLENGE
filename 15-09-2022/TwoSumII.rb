=begin
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 14/09/2022
	@ Problem Statement: Given a 1-indexed array of integers numbers that is already
		sorted in non-decreasing order, find two numbers such that they add up to a 
		specific target number. Let these two numbers be numbers[index1] and numbers[index2]
		where 1 <= index1 < index2 <= numbers.length. Return the indices of the two numbers, index1 and index2, 
		added by one as an integer array [index1, index2] of length 2.The tests are generated such that 
		there is exactly one solution. You may not use the same element twice.
		Your solution must use only constant extra space.
	@ Example 1:
		Input: numbers = [2,7,11,15], target = 9
		Output: [1,2]
		Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
=end
def two_sum(numbers, target)
    f = 0
    l = numbers.length()-1
    while(f<=l) do
        s = numbers[f]+numbers[l]
        l-=1 if s>target
        f+=1 if s<target
        return [f+1,l+1].inspect() if s==target
    end
    return [f+1,l+1].inspect()
end

puts(two_sum([1,2,3,4],5))