package Assign___Array;
import java.util.*;
public class array_triplet_sum {

	  public static void main(String args[]) {
          Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []ar=new int[n];
		for(int a=0;a<n;a++) {
			ar[a]=sc.nextInt();
		}
        int target=sc.nextInt();
		tar(ar,target,n);
    }
    public static void tar(int[] arr,int t,int n) {
     //   int temp1=0;
       // int temp2=0;
        //int temp3=0;
        int brr[]=new int[3];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                        if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[k]!=arr[i]){
                        if(arr[i]+arr[j]+arr[k]==t){
                            brr[0]=arr[i];
                            brr[1]=arr[j];
                            brr[2]=arr[k];
                        }
                        }
                    }
                }
        //   Selection(brr);
           for(int l=0;l<3;l++) {
  			 int min=l;
  			 for(int m=l+1;m<3;m++) {
  				 if(brr[min]>brr[m]) {
  					 min=m;
  				 }
  			 }
  			 int temp=brr[l];
  			 brr[l]=brr[min];
  			 brr[min]=temp;	
  			 
  		 }
             System.out.println(brr[0]+" "+brr[1]+" and "+brr[2]);
      }
           
                }
                // System.out.println(temp1+" "+temp2+" and "+temp3);
            }
       
    
   /* public static void Selection(int[] ar) {
		 for(int i=0;i<3;i++) {
			 int min=i;
			 for(int j=i+1;j<3;j++) {
				 if(ar[min]>ar[j]) {
					 min=j;
				 }
			 }
			 int temp=ar[i];
			 ar[i]=ar[min];
			 ar[min]=temp;	
			 
		 }
           System.out.println(ar[0]+" "+ar[1]+" and "+ar[2]);
    */

