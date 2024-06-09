package Linked_List;

public class Linked_List_Cycle {// floyed cycle detaction

	// leetcode se uthaye hai .khud bhi likh skte hai.

	// run here-
	// https://leetcode.com/problems/linked-list-cycle/

	// Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public boolean hasCycle(ListNode head) {
			ListNode fast = head;
			ListNode slow = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next;
				if (slow == fast) {
					return true;
				}
			}
			return false;

		}
	}

}