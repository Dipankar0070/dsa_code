package Linked_List;

public class My_Linked_List_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
My_Linked_List ll=new My_Linked_List();
ll.addfirst(10);
ll.addfirst(20);
ll.addfirst(30);
ll.display();
ll.addlast(40);
ll.addlast(50);
ll.addlast(60);
ll.display();
ll.addatindex(99,3);
ll.display();
System.out.println(ll.getfirst());
System.out.println(ll.getlast());
System.out.println(ll.getatindex(3));
System.out.println(ll.removefirst());
ll.display();
System.out.println(ll.removelast());
ll.display();
System.out.println(ll.removeatindex(2));
ll.display();

	}

}
