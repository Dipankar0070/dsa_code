package Assign___String_Sliding_Window;
import java.util.*;
public class Finding_CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
			String s=sc.next();		
			int cnt=0;
		boolean [] visited =new boolean[s.length()];
		for(int length=1;length<=s.length();length++) {
			for(int j=length;j<=s.length();j++) {
				int i=j-length;
				String s1=s.substring(i,j);
				long num=Long.parseLong(s1);
				if(isCbNumber(num) && isValid(visited,i,j)) {
					cnt++;
					for(int k=i;k<j;k++) {
						visited[k]=true;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
	public static boolean  isCbNumber(long s) {
		if(s==0 || s==1) {
			return false;
		}
		int[] arr= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(s==arr[i]) {
				return true;
			}
			}
		for(int i=0;i<arr.length;i++) {
			if(s%arr[i]==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isValid(boolean [] visited,int i,int j) {
		  for(int m=i;m<j;m++) {
			  if(visited[m]==true) {
				  return false;
			  }
		  }
		  return true;
	}

}
