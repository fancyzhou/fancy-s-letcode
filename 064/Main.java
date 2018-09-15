import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int[][] arr= {{0,3,1},
		             {1,5,1}
		};
		int xmax=arr.length;
		int ymax=arr[0].length;
		int[][] dp=new int[xmax][ymax];
		dp[0][0]=arr[0][0];
		for(int i=1;i<xmax;i++) {
		
			dp[i][0]=dp[i-1][0]+arr[i][0];
			
		}
		for(int i=1;i<ymax;i++) {
			dp[0][i]=dp[0][i-1]+arr[0][i];
		}
		Main m=new Main();
		for(int i=1;i<xmax;i++) {
			for(int j=1;j<ymax;j++) {
				dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+arr[i][j];
				
			}
		}
		System.out.println(dp[xmax-1][ymax-1]);
		
		

	}
	public int mycheck(int x,int y) {//路径可以为0不应该提前告知嘛。。。。
		if(x!=0&&y!=0)
			return Math.min(x, y);
		else if(x==0&&y!=0)
			return y;
		else if(x!=0 && y==0)
			return x;
		else 
			return 0;
	}
	
	


}
