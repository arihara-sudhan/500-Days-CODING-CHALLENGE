''' 
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 23/09/2022
    @ Problem Statement : Given an m x n matrix, return all elements of the matrix in spiral order.
        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [1,2,3,6,9,8,7,4,5]
'''


class Solution:
    def spiralOrder(self, matrix):
        res = []   # Result Matrix
        left,right = 0,len(matrix[0])
        top,bot = 0,len(matrix)
        while(left<right and top<bot):
            for i in range(left,right):
                res.append(matrix[top][i])
            top+=1
            
            for i in range(top,bot):
                res.append(matrix[i][right-1])
            right-=1
            
            if not(left<right and top<bot): break

            for i in range(right-1,left-1,-1):
                res.append(matrix[bot-1][i])
            bot-=1
                            
            for i in range(bot-1,top-1,-1):
                res.append(matrix[i][left])
            left+=1
            
        return res
