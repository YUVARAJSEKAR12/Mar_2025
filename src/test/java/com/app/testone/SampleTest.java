package com.app.testone;

public class SampleTest {
	
	public static String rep(String data) {
		int n = data.length();
		String s = "";
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int k=0;
				while(j+k<n && data.charAt(i+k)==data.charAt(j+k)) {
					k++;
				}
				if(k>s.length()) {
					s = data.substring(i,i+k);
				}
			}	
		}
		return s;
		
	}

	public static void main(String[] args) {
		String s1 = "asdfgaaaaaaaasssssssfjjj";
		String rep = rep(s1);
		System.out.println(rep);
	}

}
