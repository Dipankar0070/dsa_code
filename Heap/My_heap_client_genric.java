package Heap;
import java.util.*;
public class My_heap_client_genric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_heap_genric<Car> gp=new My_heap_genric();
		
		gp.add(new Car(11000,1890,"White"));
		gp.add(new Car(2000,20,"Blue"));
		gp.add(new Car(35000,1130,"Black"));
		gp.add(new Car(4000,4500,"Red"));
		gp.add( new Car(50500,5,"Orange"));
		gp.display();
		}

}
