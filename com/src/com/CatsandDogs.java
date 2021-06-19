package com;

import java.util.Scanner;

public class CatsandDogs {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] ch=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				ch[j]=s.nextInt();
			}
			for(int j=0;j<ch.length;j++){
				
			}
			if(ch[2]>=4){
				System.out.println("yes");
			}else{
				System.out.println("NO");
			}
		}
	}
}
