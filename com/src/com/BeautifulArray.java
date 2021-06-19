package com;

import java.util.Scanner;

public class BeautifulArray {
	static int sum=0;
	String[] g=new String[3];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int m=s.nextInt();
			int[] ch=new int[m];
			for(int j=0;j<m;j++){
				ch[j]=s.nextInt();
			}
			for(int j=0;j<ch.length;j++){
				sum=sum+ch[j];
			}
			if(sum<10){
				System.out.println("yes");
				
			}else{
				System.out.println("no");
			}
			sum=0;
		}
	}
}
