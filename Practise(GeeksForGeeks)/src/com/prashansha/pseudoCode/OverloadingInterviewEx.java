package com.prashansha.pseudoCode;

public class OverloadingInterviewEx {

	public static void main(String[] args) {
		OverloadingInterviewEx obj=new OverloadingInterviewEx();
		obj.checkOverloading(new Integer(5));
		obj.checkOverloading(5);

	}
	
	public void checkOverloading(Integer i)
	{
		System.out.println("Wrapper class Integer");
	}
	
	public void checkOverloading(Object i)
	{
		System.out.println("Object class Integer");
	}
	
	public void checkOverloading(Number i)
	{
		System.out.println("Number class Integer");
	}
	
	public void checkOverloading(int i)
	{
		System.out.println("Primitive class int");
	}

}

