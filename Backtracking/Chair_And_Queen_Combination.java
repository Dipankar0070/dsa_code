                        //COMBINATION


package Backtracking;
import java.util.*;
public class Chair_And_Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tq=2; //total number of queen
		int tc=4; //total number of chair
		boolean[] board=new boolean[tc]; 
		caq(tq,board,0,"",0);
	}
	public static void caq(int q,boolean[] board,int qpsf,String ans,int idx) {
		if(q==qpsf) {
			System.out.println(ans);
			return;
		}
			
		for(int i=idx ;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
			
			caq(q,board,qpsf+1,ans+"B"+i+"q"+qpsf,i+1);
			board[i]=false;
			}
		}
		
	}

}
