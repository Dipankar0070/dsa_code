package Heap;

public class My_heap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_heap hp = new My_heap();		
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(2);
		hp.add(-10);
		hp.add(-20);
		hp.display();
		System.out.println(hp.remove());
		hp.display();
		
		System.out.println(hp.remove());
		hp.display();
		System.out.println(hp.min());
		
		 
		System.out.println(hp.size());
		
		
		
	}

}
