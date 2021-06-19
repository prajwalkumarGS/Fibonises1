package com;

import java.util.ArrayList;
import java.util.Scanner;

public class TempleLand {
	static int d,y;
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int m=s.nextInt();
			int[] a=new int[m];
			for(int j=0;j<m;j=m){
				for(int t=0;t<a.length;t++){
					a[t]=s.nextInt();
				}
				d=a[a.length/2];
				y=a[a.length/2-1];

				if(a[0]==1&&a[a.length-1]==1&&y==d-1){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}			
		}
	}
}