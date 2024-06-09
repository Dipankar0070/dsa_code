package Queue;

public class Dynamic_Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Dynamic_Queue q=new Dynamic_Queue();
		q.Enqueue(10);
		q.display();
		q.Enqueue(20);
		q.display();
		q.Enqueue(30);
		q.display();
		q.Enqueue(40);
		q.display();
		q.Enqueue(50);
		
		q.display();
		System.out.println(q.Dequeue());
		q.display();
		q.Enqueue(60);
		q.display();
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.Enqueue(50);
		q.display();
		
	}

}