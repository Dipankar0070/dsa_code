package Time_Complexity;
import java.util.*;
public class Print_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Prime_Sieve(n);
	}
	public static void Prime_Sieve(int n) {
		
		boolean [] arr=new boolean[n+1];
		
		for(int i=2;i*i<=n;i++) {
			if(arr[i]==false) {
			for(int j=2;i*j<=n;j++) {
				
				arr[i*j]=true;
			}
			}
		}
		for(int i=2;i<=n;i++) {
			if(arr[i]==false) {
				System.out.println(i+" ");
			}
		}
		
	}

}
