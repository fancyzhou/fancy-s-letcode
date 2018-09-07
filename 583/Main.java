
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String word1="";
		String word2="a";
	
		String[] word1List=word1.split("");
		String[] word2List=word2.split("");
		int w1=word1List.length-1;
		int w2=word2List.length-1;
	
		//System.out.println(w1+" "+w2);
		int[][] com=new int[w1+1][w2+1];
 		for(int i=0;i<=w1;i++) {
			for(int j=0;j<=w2;j++) {
				if(word1List[i].equals(word2List[j])) {
					if(i>0 && j>0)
						com[i][j]=com[i-1][j-1]+1;
					else
						com[i][j]=1;
				}else {
					if(i>0&&j>0) {
						if(com[i][j-1]>=com[i-1][j])
						com[i][j]=com[i][j-1];
						else
						com[i][j]=com[i-1][j];
					}else if(i>0&&j<=0) {
						com[i][j]=com[i-1][j];
					}else if(i<=0&& j>0) {
						com[i][j]=com[i][j-1];
					}else
						com[i][j]=0;
					
				}
			}
		}
 		System.out.println(w1+w2+2-2*com[w1][w2]);
 	
	}
	

}
