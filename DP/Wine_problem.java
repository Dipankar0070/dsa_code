package DP;
import java.util.*;
public class Wine_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine= {2,3,5,1,4};
		System.out.println(maxProfit(wine,0,wine.length-1,1));
	}
	public static int maxProfit(int[] wine,int i,int j,int year) {
		
		if(i>j) {
			return 0;
		}
		
		
		int fs=wine[i]*year+maxProfit(wine,i+1,j,year+1);
		int ls=wine[j]*year+maxProfit(wine,i,j-1,year+1);
		return Math.max(fs, ls);
	}

}
