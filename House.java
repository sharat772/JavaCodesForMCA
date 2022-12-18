// Java program to find the length of the largest
// region in boolean 2D-matrix
import java.io.*;
import java.util.*;

class House {
	static int ROW, COL, count;
	static boolean isSafe(ArrayList<ArrayList<Integer>> M, int row, int col,boolean[][] visited)
	{
		return (
			(row >= 0) && (row < ROW) && (col >= 0)
			&& (col < COL)
			&& (M.get(row).get(col) == 1 && !visited[row][col]));
	}
	static void DFS(ArrayList<ArrayList<Integer>> M, int row, int col,boolean[][] visited)
	{
		int[] rowNbr = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] colNbr = { -1, 0, 1, -1, 1, -1, 0, 1 };
		visited[row][col] = true;
		for (int k = 0; k < 8; k++) {
			if (isSafe(M, row + rowNbr[k], col + colNbr[k],
					visited)) {
				count++;
				DFS(M, row + rowNbr[k], col + colNbr[k],
					visited);
			}
		}
	}
	static int largestRegion(ArrayList<ArrayList<Integer>> M)
	{
        ROW=M.size();
        COL=M.get(0).size();
		boolean[][] visited = new boolean[ROW][COL];
		int result = 0;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (M.get(i).get(j) == 1 && !visited[i][j]) {
					count = 1;
					DFS(M, i, j, visited);
					result = Math.max(result, count);
				}
			}
		}
		return result;
	}

	public static void main(String args[])
	{
		int N[][] = { { 0, 0, 1, 1, 0 },
					{ 1, 0, 1, 1, 0 },
					{ 0, 1, 0, 0, 0 },
					{ 0, 0, 0, 0, 1 } };
		// ROW = 4;
		// COL = 5;
        ArrayList<ArrayList<Integer>> M=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<N.length;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<N[i].length;j++){
                temp.add(N[i][j]);
            }
            M.add(temp);
        }
		System.out.println(largestRegion(M));
	}
}

