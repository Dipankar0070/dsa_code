package Time_Complexity;
import java.util.*;
public class Check_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(isPrime(N));
	}
	
	public static boolean isPrime(int N) {
		int div=2;
		while(div*div <= N ) {       // because div=  sqrt(N)
			if(N%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
