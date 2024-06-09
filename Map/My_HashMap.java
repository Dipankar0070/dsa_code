package Map;

import java.util.*;

public class My_HashMap {

	class Node {
		String key;
		int val;
		Node next;
	}

	private Node[] buk;
	private int size;

	public My_HashMap(int n) {
		buk = new Node[n];
	}

	public My_HashMap() {
		this(4);
	}

	public void put(String key, Integer val) {
		// bucket number = bn
		int bn = hashfun(key);
		Node temp = buk[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.val = val;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.val = val;
		nn.next = buk[bn];
		buk[bn] = nn;
		size++;
		double tf = 2.0;
		double lf = (1.0 * size) / buk.length; // double banane ke liye 1.0 se multiply kiye hai.
		if (tf < lf) {
			rehashing();
		}
	}

	public void rehashing() {
		Node[] newbuk = new Node[2 * buk.length];
		Node[] a = buk;
		buk = newbuk;
		size = 0;
		for (Node temp : a) {
			while (temp != null) {
				put(temp.key, temp.val);
				temp = temp.next;
			}
		}
	}

	public Integer get(String key) {
		int bn = hashfun(key);
		Node temp = buk[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.val;
			}
			temp = temp.next;
		}
		return null;
	}

	public Boolean containsKey(String key) {
		int bn = hashfun(key);
		Node temp = buk[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public Integer remove(String key) {
		int bn = hashfun(key);
		Node curr = buk[bn];
		Node previous = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			previous = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		}
		// element is found at first node
		if (previous == null) {
			buk[bn] = curr.next;
			curr.next = null;
		} else {
			previous.next = curr.next;
			curr.next = null;
		}
		size--;
		return curr.val;
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node temp : buk) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.val + ", ";
				temp = temp.next;

			}
		}
		return s + "}";
	}

	public int hashfun(String key) {
		int idx = key.hashCode() % buk.length;
		// parantu vats🤣🤣lekin, but
		// hashCode negative value bhi deta hai.
		// jaise ki agar wo -5 de diya tb.
		// -5%4 ka ans to -1 aayega wo to index kaise hoga aray ka
		// isiliye -1 me divisor ko add krenge.
		if (idx < 0) {
			idx = idx + buk.length;
		}
		return idx;
	}

}
