package OOPS_1;

public class SStudent {

	String name;
	int age;	
	public void StudentInformation() {
		System.out.println("Name is "+name+" and age is "+age);
	}
	
	public void Say_Hii(String name)	{
		
		
		System.out.println(name + " say hii to "+ this.name);
	}
	
	public void detalis(String name,int age) {
		System.out.println("Name is "+ name + "and age is. "+ age +"and Name is "+this.name+" and age is "+ this.age);
	}
	/*public SStudent(String name){
		
	this.name=name;                
		
	}
	public void display() {
		System.out.println(name);
	}*/
	

}
