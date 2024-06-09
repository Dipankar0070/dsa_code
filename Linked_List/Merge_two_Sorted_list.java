package Linked_List;

public class Merge_two_Sorted_list {
	//https://leetcode.com/problems/merge-two-sorted-lists/
	// Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode ans=new ListNode();
	        ListNode temp=ans;
	        while(list1!=null && list2!=null){
	            if(list1.val<=list2.val){
	                ans.next=list1;
	                ans=ans.next;
	                list1=list1.next;
	            }
	            else{
	                ans.next=list2;
	                ans=ans.next;
	                list2=list2.next;
	            }
	               

	    }
	             if(list1==null){
	                ans.next=list2;
	                }
	                else{
	                 ans.next=list1;
	                }
	    return temp.next;

	}
	}
}
