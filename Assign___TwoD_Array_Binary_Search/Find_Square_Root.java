package Assign___TwoD_Array_Binary_Search;

import java.util.*;

public class Find_Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		fun(no);
	}
		public static int fun(int no) {
		for(int i=0;i<=no/2;i++) {
			if(i*i==no) {
				return i;
				
			}
			else if(i*i>no){
                return i-1;
                
            }
		}
		return 0;
		
	}

}
