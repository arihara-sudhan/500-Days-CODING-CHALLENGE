/*
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 20/09/2022
    @ Problem Statement : 
    Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
    This matrix has the following properties:
		@ Integers in each row are sorted in ascending from left to right.
		@ Integers in each column are sorted in ascending from top to bottom.s
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {    
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        int top=0,bot = ROWS-1;
        while(top<=bot){
            int row = (top+bot)/2;
            if(target>matrix[row][COLS-1])
                top = row+1;
            else if(target<matrix[row][0])
                bot = row-1;
            else
                break;
        }
        if(top>bot) return false;
        int row = (top+bot)/2;
        int l = 0, r = COLS-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(target>matrix[row][mid])
                l = mid+1;
            else if(target<matrix[row][mid])
                r = mid-1;
            else 
                return true;
        }
    System.out.println("Here");
    return false;
    }
}