package OOPS_2;

public class UPI_payment_client {

	public static void main(String[] args) {
		
		//payment_method pm=new payment_method();
		//line no 7 ka kaam nahi kr skte hai
		//lekin java8 me naya feature aaya hai kis se ki aisa kraya jata hai.
		
		payment_method pmm=new payment_method() {
			@Override
			public void pay() {
				//upi ka apna tarika hoga pay krne ka
			}
				@Override
			public void transfer() {
					//upi ka apna tarika hoga transfer krne ka

			}
		};
		UPI_payment up = new UPI_payment();
	}

}
