package Queue;

public class Reverse_Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		My_Queue q=new My_Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		
		
		q.display();
		reverse(q);
		q.display();
		
	}
public static void reverse(My_Queue q) throws Exception {
	if(q.isEmpty()) {
		return;
	}
	int k=q.Dequeue();
	reverse(q);
	q.Enqueue(k);
	
}
}
