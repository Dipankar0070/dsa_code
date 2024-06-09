                           
                              //PERMUTATION


package Backtracking;
import java.util.*;
public class Chair_AND_Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NoOfChair=4;
		int NoOfQueen=2;
		boolean[] Chair=new boolean[NoOfChair];
		CAQ(Chair,NoOfQueen,0,"");
		//qpsf=queen placed so far
	}
	public static void CAQ(boolean[]Chair,int q,int qpsf,String ans) {
		if(q==qpsf) {
			System.out.println(ans);
			return;
		}
		
		
		
		for(int i=0;i<Chair.length;i++) {
			if(Chair[i]==false) {
				Chair[i]=true;
				CAQ(Chair,q,qpsf+1,ans+"B"+i+"q"+qpsf);
				Chair[i]=false;
			}
		}
	}

}
