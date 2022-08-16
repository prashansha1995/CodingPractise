package com.prashansha.pseudoCode;

public class StaticBlockExecutionEx {
	
	private StaticBlockExecutionEx()
	{
		System.out.println("Inside constructor "+i);
	}
	
	private StaticBlockExecutionEx(int i)
	{
		StaticBlockExecutionEx.i=i;
		System.out.println("Inside constructor "+i);
	}
	
	private static int i=0;

	static {
		i=1;
	System.out.println("Static block 1 "+i);
	}
	
	{
	System.out.println("Initializer block"+i);
	}
	
	static {
		i=2;
	System.out.println("Static block 2 "+i);
	}
	public static void main(String[] args) {
		System.out.println("Inside main method");
		StaticBlockExecutionEx obj1=new StaticBlockExecutionEx(); 
		StaticBlockExecutionEx obj2=new StaticBlockExecutionEx(3); 
		System.out.println("Inside main method printing i value"+i);


	}
	
	static {
	System.out.println("Static block 3 "+i);
	}

}
