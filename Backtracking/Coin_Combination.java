package Backtracking;
import java.util.*;
public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] purse= {1,3,2,5};
		int max=6;
		cp(purse,max,"",0,0);
	}
	public static void cp(int[] purse , int max , String ans, int count, int idx) {
		if(count==max) {
			System.out.println(ans);
			return;
		}
		if(count>max) {
			return;
		}
		
		for (int i=idx;i<purse.length;i++) {
			if(purse[i]<=max) {
			cp(purse,max,ans+purse[i],count+purse[i],i);
		} 
			
		}
	}

}
