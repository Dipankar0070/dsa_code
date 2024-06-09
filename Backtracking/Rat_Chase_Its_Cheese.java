package Backtracking;

import java.util.*;

public class Rat_Chase_Its_Cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		char[][] maze = new char[m][n];
		for (int i = 0; i < m; i++) {
			String row = sc.next();
			for (int j = 0; j < n; j++) {		
				maze[i][j] = row.charAt(j);

			}
		}
		int[][] ans = new int[m][n];
		rat(maze, 0, 0, ans);
		if (check == 0) {
			System.out.println("No path found");
		}
	}

	// cc-current column
	// cr-current row
	static int check = 0;

	public static void rat(char[][] maze, int cr, int cc, int[][] ans) {

		if (cc < 0 || cr < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc] == 'x') {
			return;
		}
		if (cc == maze[0].length - 1 && cr == maze.length - 1) {
			ans[cr][cc] = 1;
			print(ans);
			check = 1;
		}
		maze[cr][cc] = 'x';
		ans[cr][cc] = 1;

		rat(maze, cr, cc - 1, ans);
		rat(maze, cr, cc + 1, ans);
		rat(maze, cr - 1, cc, ans);  
		rat(maze, cr + 1, cc, ans);

		maze[cr][cc] = 'o';
		ans[cr][cc] = 0;
	}

	public static void print(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
