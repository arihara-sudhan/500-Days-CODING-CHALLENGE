/*
    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 24/09/2022
    @ Problem Statement : Print the mostly occuring character
*/
import java.util.HashMap;
class CountCharsMax {
	static void disp(String str){
		HashMap<Character,Integer> hm = new HashMap<>();
		char[] strarr = str.toCharArray();
		for(char x:strarr){
			if(hm.containsKey(x)){
				hm.put(x,hm.get(x)+1);
			}
			else
				hm.put(x,1);
		}
		int t = -1;
		hm.forEach((k,v)->{
			if(v>t){
				t = v;
			} });
		System.out.println(t);
	}
	public static void main(String[] args){
	    disp("hello");
	}
}