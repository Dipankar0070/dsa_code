package Functions;
import java.util.*;
public class Armstrong_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Is_Armstrong_num(n));
		
	}
	public static boolean Is_Armstrong_num(int n){
		int d=count_digit(n);
		int sum=0;
		int p=n;
		while(n>0) {
			int rem=n%10;
			sum=(int) (sum+ Math.pow(rem,d));
			n=n/10;
		}
		if(sum==p) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int count_digit(int l) {
		int count=0;
		while(l>0) {
			count++;
			l=l/10;
		}
		return count;
	}
}
