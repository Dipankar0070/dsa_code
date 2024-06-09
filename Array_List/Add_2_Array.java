package Array_List;
import java.util.*;
public class Add_2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1=  {9,8}  ;// {2,3,4,5};
int[] arr2= {7,7};//{6,3,8,4,3,6};
ArrayList<Integer> ar= new ArrayList<>();
int carry=0;
int end1=arr1.length-1;
int end2=arr2.length-1;
while(end1>=0 && end2>=0) {
	int a=arr1[end1]+arr2[end2]+carry;
	 carry=a/10;
	int sum=a%10;
	ar.add(sum);
	end1--;
	end2--;
	
}
while(end1>=0) {
	int a=arr1[end1]+carry;
	carry=a/10;
	int sum=a%10;
	ar.add(sum);
	end1--;
}
while(end2>=0) {
	int a=arr2[end2]+carry;
	carry=a/10;
	int sum=a%10;
	ar.add(sum);
	end2--;
}
if(carry!=0) {
	ar.add(carry);
}
System.out.print(ar+" ");
System.out.println();
for(int i=ar.size()-1;i>=0;i--) {
	System.out.print(ar.get(i)+" ");
}
	}

}
