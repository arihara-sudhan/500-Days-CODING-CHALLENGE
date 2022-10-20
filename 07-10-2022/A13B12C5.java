/**
		
**/

class A13B12C5 {
	public static void main(String[] args) {
		String input = "a13b12c55";
		char arr[]  = input.toCharArray();
		int x = 0; char val; String num="";
		while(x<arr.length){
				val = arr[x];
				x++;
				while(x<arr.length && arr[x]>='1' && arr[x]<='9'){
					num = num+arr[x];
					x++;
				}
			int times = 0;
			while(times<Integer.parseInt(num)){
				System.out.print(val);
				times++;
			}
			num = "";
		}
	}	
}