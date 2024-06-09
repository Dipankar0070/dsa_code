package Linked_List;

public class Middle_of_Linked_List {

//leetcode se uthaye hai .khud bhi likh skte hai.

	// run here-
	// https://leetcode.com/problems/middle-of-the-linked-list/

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode middleNode(ListNode head) {
			ListNode fast = head;
			ListNode slow = head;
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;

			}
			return slow;
		}
	}
}
