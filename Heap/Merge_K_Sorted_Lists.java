package Heap;

import java.util.*;

public class Merge_K_Sorted_Lists {

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
		public ListNode mergeKLists(ListNode[] lists) {
			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

				@Override
				public int compare(ListNode o1, ListNode o2) {
					// TODO Auto-generated method stub
					return o1.val-o2.val;
				
				}
				});
			for (int i = 0; i < lists.length; i++) {
				if (lists != null) {
					pq.add(lists[i]);
				}
			}
			ListNode ll = new ListNode();
			ListNode temp = ll;
			while (pq.size() > 0) {
				ListNode rv = pq.remove();
				if (rv.next != null) {
					pq.add(rv.next);
				}
				ll.next = rv;
			}
			return temp.next;
		
	}
