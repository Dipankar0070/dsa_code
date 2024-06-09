package OOPS_1;

//import Lec_1.Studentt; // importing from Lec 1 because it is in other package

public class SStudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Studentt s1=new Studentt();
		// s1.name="Ayush 1"
		// s1.age=20;
		// s1.Info();

		System.out.println("siuuuuuuu");

		//double click at line 18 to mark it as break.
		//use symbol left to the run symbol to debug it.
		
		SStudent s = new SStudent();   //some 2k address is given to the s.
 
		s.name = "Jethiya 1";        // 2.1 k address is given as it is a non primitive data. so address is given to it.
		s.age = 50;                  // primitive data so no address is given.
		s.StudentInformation();      //Now the 2k address is given to "this".
		System.out.println();

		SStudent s1 = new SStudent();  //some 4k address is given to the s1.

		s1.name = "Jethiya 2";       // 4.1 k address is given as it is a non primitive data. so address is given to it.
		s1.age = 55;                 // primitive data so no address is given.
		s1.StudentInformation();     // now the 4k address is given to this.
		System.out.println();
	
		s.Say_Hii("Bhindi_Master");
		System.out.println();

		
		s1.Say_Hii("Bhindi_Master");
		System.out.println();

	/*	SStudent s2=new SStudent("Ayush");
		s2.name="hathi";           // can make change in the constructo but without constructor it can't.									
		s2.display();*/

	
	
	
	
	
	
	
	}
}
