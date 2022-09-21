/*
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 21/09/2022
    @ Problem Statement : 
    Sort the given Matrix (2D)
*/

class Sort2DMat {
	public static void main(String[] args){
		int a[][] = {{9,8,7},{6,5,4},{3,2,1}};
		int temp[] = new int[a.length*a[0].length];
		int b = 0;
		//Make it 1D
		for(int x[]:a){
			for(int i:x)
				temp[b++] = i;
		}
		// Sort
		for(int i=0;i<temp.length;i++)
			for(int j=i+1;j<temp.length;j++){
				if(temp[i]>temp[j]){
					int t = temp[i];
					temp[i] = temp[j];
					temp[j] = t;
				}
			}
		// Again to 2D
		b = 0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				a[i][j] = temp[b++];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}