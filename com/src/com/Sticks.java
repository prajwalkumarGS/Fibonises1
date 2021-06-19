package com;

import java.util.Scanner;

public class Sticks {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++){
		int m=s.nextInt();
		int[] ch=new int[m];
		for(int j=0;j<m;j++){
			ch[j]=s.nextInt();
		}
		if(m%2!=0){
			if(ch[0]+ch[1]==ch[2]){
				System.out.println("2");
			}
		}else{
			System.out.println("-1");
		}
	}
}
}
