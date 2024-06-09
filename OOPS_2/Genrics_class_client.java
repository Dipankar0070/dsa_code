package OOPS_2;

public class Genrics_class_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Genrics_class<Integer,Character> gc=new Genrics_class<>();
Genrics_class<Boolean,String> gc1=new Genrics_class<>();
Genrics_class<Byte,Byte> gc2=new Genrics_class<>();
Genrics_class<Integer,Integer> gc3=new Genrics_class<>();

gc.value1();
gc1.value2();
gc2.value2();
gc3.value1();
	}

}
