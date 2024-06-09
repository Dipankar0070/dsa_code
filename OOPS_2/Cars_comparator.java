package OOPS_2;

public class Cars_comparator /*implements Comparable<Cars_comparator>*/{
	int speed;
	int price;
	String color;


	public Cars_comparator(int price,int speed,String color){
		this.price=price;
		this.speed=speed;
		this.color=color;
		
	}

		@Override
		public String toString() {
			return "Price= "+this.price+" Speed= "+this.speed+" Color= "+this.color;
		}




}
