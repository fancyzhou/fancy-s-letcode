import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static int[][] marr;
	static int xMax=0;
	static int yMax=0;
	static int minstep=99999999;
	public static void main(String[] args) {
		/*int[][] arr= {{1,3,1},
		             {1,5,1},
		            {4,2,1}
		};*/
		int [][] arr= {{1}};
		Main m=new Main();
		m.marr=arr;
		m.xMax=m.marr.length;
		m.yMax=m.marr[0].length;
		m.minstep=99999999;
		m.go(0,0,0);
		System.out.println(m.minstep);
		

	}
	public void go(int x,int y,int nowstep) {
		if(x>=0 &&x<xMax&&y>=0 &&y<yMax) {
			nowstep+=marr[x][y];
			if(nowstep>minstep)
				return;//如果当前路径比最小值大了，那么继续走下去也没有意义
			
			if(x==xMax-1&&y==yMax-1) {
				if(nowstep<minstep)
					minstep=nowstep;
			}else {
				go(x+1,y,nowstep);
				go(x,y+1,nowstep);
			}
		}
	}


}
