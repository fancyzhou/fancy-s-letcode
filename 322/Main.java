import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	
		//int[] coins= {186,419,83,408};
		//int amount=6249;
		int[] coins= {2};
		int amount=1;
		
		Main m=new Main();


		System.out.println(m.go(amount, coins));
		
	}
	public int  go(int am,int[] coins ) {
		
		int le=coins.length;
		if(am==0)
			return 0;
		if(le==0)
			return -1;
		Arrays.sort(coins);
		int[] dp=new int[am+1];
		for(int n=0;n<coins.length;n++) {
			if(coins[n]<=am)
				dp[coins[n]]=1;
		}
		
		int step=0;
		for(int i=1;i<=am;i++) {
			int min=-1;
			for(int n=0;n<coins.length;n++) {
				if(coins[n]>i) {
					break;
				}
				else if( coins[n]==i) {
					min=-1;
					break;
				}
				else {
					int d=dp[i-coins[n]];
					if(d!=0) {
						
					if(min>d || min==-1)
						min=d;
					}
				}
			}
			if(min>0)
				dp[i]=min+1;
			
		}
		if(dp[am]==0)
			return -1;
		else
			return dp[am];
	}
   
  
	


}
