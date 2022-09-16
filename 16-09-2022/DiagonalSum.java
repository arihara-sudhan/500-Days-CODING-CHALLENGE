/**
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 16/09/2022
	@ Problem Statement: Add elements in diagonal of a matrix
*/
import java.util.Arrays;
class DiagonalSum {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        int rows = a.length;
        int cols = a[0].length;
        int sum = 0;
        for(int x=0;x<rows;x++){
            for(int y=0;y<cols;y++){
                if(x==y)
                    sum+=a[x][y];
            }
        }
        System.out.println(sum);
    }
}
