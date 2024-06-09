package Linked_List;

public class Sort_List {
//https://leetcode.com/problems/sort-list/

	// * Definition for singly-linked list.
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
		public ListNode sortList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}
			ListNode Middle = middleNode(head);
			ListNode head_B = Middle.next;
			Middle.next = null;

			ListNode L1 = sortList(head);
			ListNode L2 = sortList(head_B);
			return mergeTwoLists(L1, L2);
		}

		public ListNode middleNode(ListNode head) {
			ListNode fast = head;
			ListNode slow = head;
			while (fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;

			}
			return slow;
		}

		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode ans = new ListNode();
			ListNode temp = ans;
			while (list1 != null && list2 != null) {
				if (list1.val <= list2.val) {
					ans.next = list1;
					ans = ans.next;
					list1 = list1.next;
				} else {
					ans.next = list2;
					ans = ans.next;
					list2 = list2.next;
				}

			}
			if (list1 == null) {
				ans.next = list2;
			} else {
				ans.next = list1;
			}
			return temp.next;

		}
	}
}
