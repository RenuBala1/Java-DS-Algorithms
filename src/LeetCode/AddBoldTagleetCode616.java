package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddBoldTagleetCode616 {

	public static void main(String[] args) {
		String s = new String("aaabbccaaa");
		String[] keywords = { "aaa","aab","bc" };
		int[] arr1= new int[s.length()];
		for (int i = 0; i < s.length(); i++) {	
			arr1[i]=0;
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < keywords.length; j++) {
				int len = keywords[j].length();
				if (i + len > s.length()) 
					continue;
				String subS=s.substring(i, i + len);

				System.out.println("Substring :"+subS);

				if (keywords[j].equals(subS)) {
					for (int k = i; k < i + len; k++) {
						arr1[k]=1;
						System.out.println("Regular array updating value at index " + k + "" + arr1[k]);
					}
				}
			}
		}
		StringBuffer sb1 = new StringBuffer();
		int i = 0;
		while (i < s.length()) {
			System.out.println("Index :" + i + "Value in map" + arr1[i]);
			if (arr1[i] == 1) {
				sb1.append("<b>");

				while (i < s.length() && arr1[i] == 1) {
					sb1.append(s.charAt(i));
					i++;
				}
				sb1.append("</b>");
			} else {
				sb1.append(s.charAt(i));
				i++;
			}
			System.out.println("String after processing : " + sb1.toString());
		}
		System.out.println("String after processing : " + sb1.toString());
	}
}
