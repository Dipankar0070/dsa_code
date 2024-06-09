package Recursion;
import java.util.*;
public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=23;
		int n=12;
		path(m,n,0,0,"");
		System.out.println(count);
	}
	static int count=0;
	public static void path(int m,int n,int row,int column,String ans) {
		if(row==m-1 && column==n-1) {
			System.out.println(ans);
			count++;
			return;
		}
		if(row>m-1 || column>n-1) {
			return;
		}
		path(m,n,row,column+1,ans+'H');
		path(m,n,row+1,column,ans+'V');
      //  path(m,n,row+1,column+1,ans+'D');

		
	}

}
