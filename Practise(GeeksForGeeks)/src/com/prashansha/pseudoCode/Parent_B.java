package com.prashansha.pseudoCode;

public class Parent_B extends Parent_A {

	@Override
	public int getInt()
	{
		return 2;
	}

	
	public static void main(String[] args) {
//		   Parent_B b= new Parent_A(); -----------will give compile time exception,ParentA cannot be convereted to ParentB

		
//   Parent_B b=(Parent_B) new Parent_A(); ----------will give runtime exception ,ClassCastException
	     System.out.println("Calling reference b and object b by type casting"+b.getInt());

		
     Parent_B b1=new Parent_B();
     System.out.println("Calling reference b and object b"+b1.getInt());

     Parent_A a=new Parent_B();
     System.out.println("Calling reference a and object b"+a.getInt());
     
     Parent_A a1=new Parent_A();
     System.out.println("Calling reference a and object b"+a1.getInt());
     
	}

}
