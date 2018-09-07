
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int yMax;
	public static int xMax;
	public static int[][] gr;

	public static void main(String args[]) {
		int max = 0;
		Main m = new Main();
		int[][] dd = { { 0, 1 } };
		m.gr = dd;
		yMax = gr.length - 1;
		xMax = gr[0].length - 1;
		for (int i = 0; i <= yMax; i++) {
			for (int y = 0; y <= xMax; y++) {
				if (gr[i][y] == 1) {
					int nowmax = m.maxArea(y, i);
					System.out.println(i + " " + y);
					if (nowmax > max) {
						max = nowmax;
					}
				}
			}
		}
	
		System.out.println(max);

	}

	public int maxArea(int x, int y) {
		if (x >= 0 && x <= xMax && y >= 0 && y <= yMax) {
		
			if (gr[y][x] == 1) {
				gr[y][x] = 0;
				return 1 + maxArea(x - 1, y) + maxArea(x + 1, y) + maxArea(x, y - 1) + maxArea(x, y + 1);
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}
}
