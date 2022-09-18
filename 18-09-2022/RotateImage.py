'''
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 18/09/2022
	@ Problem Statement : You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
	You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
	Example : 
		Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
		Output: [[7,4,1],[8,5,2],[9,6,3]] 
'''

class Rotate:
    def rotate(self, matrix):
        left , right = 0,len(matrix)-1
        while(left<right):
            for x in range(right-left):
                top , bottom = left , right 
                topLeft = matrix[top][left+x]
                matrix[top][left+x] = matrix[bottom-x][left]
                matrix[bottom-x][left] = matrix[bottom][right-x]
                matrix[bottom][right-x] = matrix[top+x][right]
                matrix[top+x][right] = topLeft
            left+=1
            right-=1
        return matrix

[print(x) for x in Rotate().rotate(
					  [[1,2,3],
					   [4,5,6],
					   [7,8,9]])]