package Backtracking;
import java.util.*;
public class WordSearch_Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[][] board= {{'A','B','C','D'},{'A','B','C','D'},{'E','F','A','G'},{'H','E','P','F'}};
		String word=sc.next();
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				
				if(board[i][j]==word.charAt(0)) { 
					
					boolean ans=search(board,i,j,word,0);
					if(ans) {
						System.out.println("word found");
						return;
					}
					
				}
			}
		}
		System.out.println("Word not found");
	}
	
public static boolean search(char[][] board,int cr,int cc,String word,int idx) {
	if(word.length()==idx) {
		return true;
	}
	
	
	if(cr<0 || cr>=board.length || cc<0 || cc>=board[0].length || board[cr][cc] != word.charAt(idx)) {
		return false;
	}
	
	int[] r= {-1,1,0,0};                  //direction me hm ja skte hai isiliye 4 recursive
	int[] c= {0,0,-1,1};                  //call laga hai array ke form me.
	
	board[cr][cc]='*';   //star daale hai taaki wo word change ho jaaye aur lock na aaye.
	
	for(int i=0;i<r.length;i++) {
		
	boolean ans=search(board,cr+r[i],cc+c[i],word,idx+1);
	if(ans==true) {
		return true;
	}
		
	}
	
	
	board[cr][cc]=word.charAt(idx);   //us star ko wapis us word me change kiye.
	
	return false;
	
}
}
























