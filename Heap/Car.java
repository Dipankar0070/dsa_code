package Heap;


public class Car implements Comparable<Car>{
int speed;
int price;
String color;


public Car(int price,int speed,String color){
	this.price=price;
	this.speed=speed;
	this.color=color;
	
}

	@Override
	public String toString() {
		return "Price= "+this.price+" Speed= "+this.speed+" Color= "+this.color;
	}
//s.compareTo(s1)
	//address of s will go to this and
	//address of s1 will go to 'o' (in line no 24)
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return o.price-this.price;
	// 	return this.speed-o.speed;
	//	return o.color.compareTo(this.color);
	}


}

