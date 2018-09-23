package ²âÊÔÓÃ;

import java.util.Scanner;

public class Main {
  
	
	public static void main(String args[]) {
		Main m=new Main();
		int[] arr= {2,7,13,19};
		int n=12;
		int[] dp=new int[n+1];
		dp[0]=1;
		int[] idx=new int[arr.length+1];
		for(int i=1;i<n;i++) {
			int befor=dp[i-1];
			int min=Integer.MAX_VALUE;
			for(int j=0;j<arr.length;j++) {
				int q=idx[j];
				if(dp[idx[j]] * arr[j]<min)
					min=dp[idx[j]] * arr[j];
				
			}
			
			for(int j=0;j<arr.length;j++) {
				if(dp[idx[j]] * arr[j]==min)
					idx[j]++;
			}
			
			dp[i]=min;
		}
		

		
		System.out.println(dp[n-1]);

	
	}

	
	
	
}
