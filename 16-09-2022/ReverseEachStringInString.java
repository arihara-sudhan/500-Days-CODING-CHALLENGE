/**
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 16/09/2022
	@ Problem Statement: Reverse the string as following
	@ Example:
		Input: Hi Hello
		Output: iH olleH
*/
class ReverseEachStringInString {
    public static void main(String[] args) {
        String str = "Hi Good Morning";
        String strs[] = str.split(" ");
        int i = 0;
        for(String x:strs){
            strs[i] = (new StringBuilder(x)).reverse().toString();
            i++;
        }
        for(String x:strs)
            System.out.print(x+" ");
    }
}
