/**
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 16/09/2022
	@ Problem Statement: Maximum Sum of Row
*/

class MaximumSumOfRows {
    public static void main(String[] args) {
        int a[][] = {{1,2,30},
                     {4,5,6},
                     {7,8,9}};
        int rows = a.length,cols=a[0].length;
        int row_sum;
        int max = -888;
        for(int x=0;x<rows;x++){
            row_sum = 0;
            for(int y=0;y<cols;y++){
                row_sum+=a[x][y];
            }
            if(row_sum>max)
                max = row_sum;
        }
        System.out.println(max);
    }
}


