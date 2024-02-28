package LeetCode;

import java.util.Stack;
import java.util.Arrays;

public class RemoveKdigitsStringSolved {

	public static String removeKdigits(String S, int K) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<S.length();i++)
		{
			char c = S.charAt(i);
			while (K > 0 && !stack.empty() && stack.peek() > c)
			{
				stack.pop();
				K-=1;
			}
			stack.push(c);
		}
		while (K>0 && !stack.empty()) { stack.pop(); K-=1; }

		StringBuilder sb= new StringBuilder();
		while(!stack.empty())
		{
			sb.append(stack.pop());

		}
		sb.reverse();
		//System.out.println("String :" + sb);


		while(sb.length()>1 && sb.charAt(0)=='0') sb.deleteCharAt(0);

		if(sb.length()==0)
			sb.append(0);
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(removeKdigits("971149",5));

	}
}
