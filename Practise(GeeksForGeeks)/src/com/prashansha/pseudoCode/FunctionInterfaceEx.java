package com.prashansha.pseudoCode;

@FunctionalInterface
 interface FunctionInterfaceEx {
	
	public int calculate(int a,int b);
     
	default void deafultMethod1()
	{
		System.out.println("Default method 1");
	}
	
	
	default void deafultMethod2()
	{
		System.out.println("Default method 1");
	}
	
	static void staticMethod1()
	{
		System.out.println("Static method 1");
	}
	
	static void staticMethod2()
	{
		System.out.println("Static method 2");
	}
}



