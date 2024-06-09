package Data_types;
import java.util.*;
public class Dec_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int mul=1;
		int sum=0;
		
		while(no>0){
			int rem=no%2;
			sum=sum+rem*mul;
			
			mul=mul*10;
			no=no/2;
		}
		System.out.println(sum);
		
	}

}
