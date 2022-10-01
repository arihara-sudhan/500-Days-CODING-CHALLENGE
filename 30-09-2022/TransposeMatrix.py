'''
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 30/09/2022
    @ Problem Statement : Given a 2D integer array matrix, return the transpose of matrix.
    The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
	Example 1:
		Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
		Output: [[1,4,7],[2,5,8],[3,6,9]]
	Example 2:
		Input: matrix = [[1,2,3],[4,5,6]]
		Output: [[1,4],[2,5],[3,6]]
'''

class Solution:
    def transpose(self, matrix):
        return [[matrix[j][i] for j in range(len(matrix))] for i in range(len(matrix[0]))]
print(Solution().transpose([[1,2,3],[4,5,6]]))