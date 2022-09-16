/**
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 16/09/2022
	@ Problem Statement: Check whether string is anagram or not.
	[ An anagram of a string is another string that contains the same characters,
	only the order of characters can be different. Example : LISTEN == SILENT ]
*/
import java.util.Arrays;
class Anagram {
    public static void main(String[] args) {
        String str1 = "appa", str2 = "papa";
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();
        if(a.length!=b.length){
            System.out.println("Not Anagram");
        }
        else {
           Arrays.sort(a);
           Arrays.sort(b);
           str1 = new String(a);
           str2 = new String(b);
           if(str1.equals(str2)){
               System.out.println("Anagram");
           }
           else{
               System.out.println("Nope");
           }
        }
    }
}
