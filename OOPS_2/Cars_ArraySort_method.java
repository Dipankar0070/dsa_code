package OOPS_2;


	public class Cars_ArraySort_method{// implements Comparable<Cars>{
		int speed;
		int price;
		String color;


		public Cars_ArraySort_method(int price,int speed,String color){
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
		//	@Override
			/*public int compareTo(Cars o) {
				// TODO Auto-generated method stub
				//return o.price-this.price;
			// 	return this.speed-o.speed;
				return this.color.compareTo(o.color);
			}*/


		}
	

