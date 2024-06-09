package Queue;

public class My_Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		My_Queue q=new My_Queue();
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
	
		
		
	}

}
