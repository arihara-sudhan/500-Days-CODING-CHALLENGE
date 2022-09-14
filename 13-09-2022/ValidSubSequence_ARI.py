'''
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 13/09/2022
	@ Problem Statement : Valid Subsequence Problem
		Input : [1,2,3] and [1,2,3,4]
		Output : True
		Explanation : [1,2,3] is a subsequence of [1,2,3,4]
'''

def validSubSequence(array, sequence):
	if not sequence:
		return False	
	i = 0
	for x in array:
		if x == sequence[i]:
			if i == len(sequence) - 1:
				return True
			i += 1
			
	return False
print(validSubSequence([1,2,3,4],[1,2,3]))