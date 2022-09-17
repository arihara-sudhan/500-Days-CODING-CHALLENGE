/*	
	******************** 500 DAYS CODING CHALLENGE *****************************
	@ AUTHOR : Ariharasudhan
	@ DATE : 17/09/2022
	@ Problem Statement : Valid Paranthesis Problem
**/


import java.util.Stack;
class ValidParanthesis {
	static boolean isValid(String str) {
		Stack<Character> stk = new Stack<>();
		for(char x:str.toCharArray()){
			if(x=='('||x=='{'||x=='[')
				stk.push(x);
			else {
				if(stk.isEmpty())
					return false;
				char top = stk.peek();
				if(top=='('&&x==')'||top=='{'&&x=='}'||top=='['&&x==']')
					stk.pop();
				else
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		String str = "[]{}[]({})";
		System.out.println(isValid(str));
	}
}
