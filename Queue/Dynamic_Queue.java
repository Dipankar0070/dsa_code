package Queue;

public class Dynamic_Queue extends My_Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int ans = (front + i) % arr.length;
				newarr[i] = arr[ans];
			}
			arr = newarr;
			front = 0;

		}
		super.Enqueue(item);

	}
}
