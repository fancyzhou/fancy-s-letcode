

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//
public class Main   {
	
	//public static int [][] realarr;
	public static int cco=0;
	public static void main(String args[]) {
		

		Main m=new Main();
		System.out.println(m.build(3));
			
		
	
		
	}
	public int correctBuild(int n)
	{
		return (int)Math.round((Math.sqrt(n)));
	}
	public int build(int n) {//这个肯定是妥妥地超时啦
		int[] arr=new int[n+1];
		for(int ii=1;ii<=n;ii++) {
			//第ii次
			for(int i=1;i<=n;i++) {
				if(i%ii==0) {
					if(arr[i]==0) {
						arr[i]=1;
					}else {
						arr[i]=0;
					}
				}
			}
		}
		int count=0;
		for(int i=1;i<=n;i++) {
			if(arr[i]==1)
				count++;
		}
		return count;
	}

		
	
	

}
