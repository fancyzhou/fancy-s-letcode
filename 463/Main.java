
public class Main {
	static int[][] arr=new int [101][101];
	static int[][] org=new int[101][101];
	static int xMax=0;
	static int yMax=0;
	public static void main(String[] args) {
	/*	int[][] grid= {{0,1,0,0},
		              {1,1,1,0},
		              {0,1,0,0},
		              {1,1,0,0}};*/
		int[][] grid= {{1}};
		
		Main m=new Main();
		m.xMax=grid.length;
		m.yMax=grid[0].length;
		m.arr=grid;
		int[][] arr2=grid.clone();
		for(int i=0;i<m.xMax;i++) {
			arr2[i]=grid[i].clone();//小心浅拷贝
		}
		m.org=arr2;
		
		int le=0;
		for(int i=0;i<m.xMax;i++) {
			for(int j=0;j<m.yMax;j++) {
				if(m.arr[i][j]==1) {
					le=m.checkLength(i, j);
					break;
				}
					
			}
		}
		System.out.println(le);
		
	}
	public int checkLength(int x,int y) {
		if(x>=0&&x<xMax&&y>=0&&y<yMax) {
			if(arr[x][y]==1) {
				int side=checkSide(x,y);
				arr[x][y]=0;
				return side+checkLength(x+1,y)+
						checkLength(x-1,y)+checkLength(x,y+1)
						+checkLength(x,y-1);
						
				
			}else {
				return 0;
			}
		}else {
			return 0;
		}
	}
	public int checkSide(int x,int y) {
		int count=0;
		if(x>0&&x<xMax-1) {
			if(org[x-1][y]==0)
				count++;
			if(org[x+1][y]==0)
				count++;
		}else if(x==0 &&x<xMax-1) {
			count++;
			if(org[x+1][y]==0)
				count++;
		}else if(x>0&& x==xMax-1) {
			count++;
			if(org[x-1][y]==0)
				count++;
		}else if(xMax==1) {
			count+=2;
		}
		if(y>0&&y<yMax-1) {
			if(org[x][y-1]==0)
				count++;
			if(org[x][y+1]==0)
				count++;
		}else if(y==0&&y<yMax-1) {
			count++;
			if(org[x][y+1]==0)
				count++;
		}else if(y>0&&y==yMax-1) {
			count++;
			if(org[x][y-1]==0)
				count++;
		}else if(yMax==1) {
			count+=2;
		}
		return count;
	}
}
