import java.util.*;
import java.io.*;

class practice {
	public static void main(String[] args) {
	String s="AAABBCCCC";
	char ch[]=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		ch[i]=s.charAt(i);
		System.out.println(ch[i]);
	}
	for(int l=0;l<ch.length;l++) {
		int count=1;
		for(int j=0;j<ch.length;j++) {
			if(ch[l]==ch[j]) {
				count++;
			}
			if(ch[l]!=ch[j]) {
				l=j;
			}
		}
		System.out.print(ch[l]+count);
	}


	}

}
