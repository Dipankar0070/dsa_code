package Array;
import java.util.*;
public class siuuuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> arr=new ArrayList<>();
		 arr.add(1);
		 arr.add(5);
		 arr.add(4);
		 //arr.add(7);
		 //arr.add(9);
		 
		int count=0;
		int i=0;
		while(i<arr.size()-1) {
			int rep1=0;
			int rep2=0;
			if(arr.get(i)>arr.get(i+1)) {
				if(arr.get(i)%2!=0) {
					rep1=(arr.get(i)-1)/2;
					rep2=(arr.get(i)+1)/2;

				}
				else {
					rep1=(arr.get(i))/2;
					rep2=(arr.get(i))/2;
				}
				arr.remove(i);
				arr.add(i,rep1);
				arr.add(i+1,rep2);
				i=0;
				count++;
			}
			else {
				i++;
			}
		}
		System.out.println(count);
	}

}
