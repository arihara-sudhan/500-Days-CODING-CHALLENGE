/*
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 20/09/2022
    @ Problem Statement : 
    X Pattern
    	1     1
    	 2   2
    	   3
    	 4   4
        5     5
*/

 class XPattern {
 	public static void main(String[] args){
 		int n = 111;
 		for(int x=1;x<=n;x++){
 			for(int y=1;y<=n;y++){
 				if(x==y||x+y==n+1)
 					System.out.print(x);
 				else
 					System.out.print(" ");
 			}
 			System.out.println();
 		}
 	}
 }

