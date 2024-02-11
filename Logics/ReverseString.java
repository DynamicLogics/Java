/*
author : Shubham S Ashtaputre
date: 09/08/2021
license: open source
*/
package easy;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Shubham";
		Character revName = null;
		String revNameA = "";
		for(int i=name.length()-1;i>=0;i--) {
			revName = name.charAt(i);
			revNameA+=revName;
		}
		System.out.println(revNameA);
	}
}
