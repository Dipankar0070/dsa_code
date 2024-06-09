package Linked_List;

public class Add_Two_Numbers {

	
	// Definition for singly-linked list.
	  public class ListNode {
	      int val;
	     ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	   /*     long sum=0;
	        long i=1;
	        while(l1 != null){
	            sum=sum+l1.val*i;
	            i=i*10;
	            l1=l1.next;
	        }
	        long sum2=0;
	        long i2=1;
	        while(l2!=null){
	            sum2=sum2+l2.val*i2;
	            i2=i2*10;
	            l2=l2.next;
	        }
	        long ans=sum+sum2;
	       ListNode anslist=new ListNode();
	       ListNode temp=anslist;
	       while(ans>0){
	        ListNode l3=new ListNode();
	       // int div=10;
	        
	        anslist.val=(int)(ans% 10);
	        anslist.next=l3;
	        ans=ans/10;
	         if(ans==0){
	           anslist.next=null; 
	        }
	        anslist=anslist.next;
	       
	        }
	        return temp;
	*/
	int carry=0;
	ListNode temp=new ListNode ();
	ListNode anslist=temp;
	while(l1!=null || l2!=null || carry==1){
	    int sum=0;
	    if(l1!=null){
	        sum=sum+l1.val;
	    l1=l1.next;
	}
	   if(l2!=null){
	       sum=sum+l2.val;
	    l2=l2.next;
	}
	sum=sum+carry;
	    int ans=sum%10;
	    carry=sum/10;
	    ListNode l3=new ListNode();
	    anslist.next=l3;
	    l3.val=ans;
	    
	    anslist=anslist.next;
	   


	}
	return temp.next;
	    }
	}

}
