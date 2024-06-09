package Divide_and_Conquer;
import java.util.*;
public class Randm_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int from=10;
		int to=90;
		Random(from,to);
	}
	public static void Random(int from, int to) {
		
		Random rand=new Random();
		int lo=from;
		int hi=to;
		
		for(int i=0;i<10;i++) {
			int rn=rand.nextInt(hi-lo+1)+lo;
			System.out.println(rn);
		}
	}

}
