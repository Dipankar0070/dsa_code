package Assign___Recursion_Backtraking;
import java.util.*;
public class Subset_problem_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        subset(arr,target,0,0,"");
	}
	public static void subset(int[]arr,int t,int i,int sum,String ans) {
		
		if(sum==t) {
			System.out.println(ans+"-");
			return;
		}
		if(sum>t) {
			return;
		}
		if(i>=arr.length) {
			return;
		}
		
		
		//sum=sum+arr[i];
		subset(arr,t,i+1,sum+arr[i],ans+arr[i]);
		subset(arr,t,i+1,sum,ans+arr[i]);
	}
	

}
