package com;

import java.util.Scanner;

public class BearandMilkyCookies {
	static int e=0;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int m=s.nextInt();
			String[] a=new String[m];
			for(int j=0;j<m;j++){
				a[j]=s.next();
			}
			int j;
			for(j=1;j<a.length;j++){

			}
			if(a.length==1){
				System.out.println("no");
			}
			else if(a[0].equals("cookie") && a[a.length-1].equals("milk")){
				System.out.println("yes");
			}
			else if(a[0].equals("cookie") && a[1].equals("cookie")){
				System.out.println("NO");
			}
			else if(a[0].equals("milk") && a[a.length-1].equals("milk")){
				System.out.println("yes");
			}		
		}
	}
}
