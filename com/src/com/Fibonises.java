package com;

import java.util.Scanner;

public class Fibonises {

	public static int z,x,v,n,m,l,p;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int e =s.nextInt();
		String[] c=new String[e+1];
		for(int k=0;k<e+1;k++){
			c[k]=s.nextLine();
		}
		for(int i=1;i<=e;i++){
			char q[]=c[i].toCharArray();

			for(int j=0;j<q.length;j++){
				if(q[j]=='a'){
					z++;

				}
				if(q[j]=='b'){
					x++;
				} 
				if(q[j]=='c'){
					v++;
				}
				if(q[j]=='n'){
					n++;
				}
				if(q[j]=='m'){
					m++;
				}
				if(q[j]=='o'){
					l++;
				}
				if(q[j]=='p'){
					p++;
				}

			}
			if(z>=3||x>=3||v>=3||m>=3||n>=3||p>=3||l>=3){
				System.out.println("Dynamic");
			}else{
				System.out.println("Not");
			}
			z=0;
			x=0;
			v=0;
		}

	}

}
