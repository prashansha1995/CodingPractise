package com.prashansha.designPatterns;


/**
 * initialize an instance in static block and handle exception.
 * @author pragupta33
 *
 */
public class SingletonEagerIntializationUsingStaticBlock {

	//private static declaration of instance
	private static SingletonEagerIntializationUsingStaticBlock singletonStaticBlockObj;
	private static SingletonEagerIntializationUsingStaticBlock singletonStaticBlockObj1;

	
	//private Constructor to restrict visibility of creation
	private SingletonEagerIntializationUsingStaticBlock() {
		
	}
	
	static {
		try {
			singletonStaticBlockObj=new SingletonEagerIntializationUsingStaticBlock();
			singletonStaticBlockObj1=new SingletonEagerIntializationUsingStaticBlock();

			
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}
	
	public static SingletonEagerIntializationUsingStaticBlock[] getInstanceofSingletonUsingStaticBlock()
	{
		SingletonEagerIntializationUsingStaticBlock array[]= {singletonStaticBlockObj ,singletonStaticBlockObj1};
		return array;
	}
	
	public void printSingletonEagerIntializationUsingStaticBlock()
	{
		System.out.println("I am calling print method of SingletonEagerIntializationUsingStaticBlock");
		System.out.println("Hashcode of singletonStaticBlockObj"+singletonStaticBlockObj.hashCode());
		System.out.println("Hashcode of singletonStaticBlockObj1"+singletonStaticBlockObj1.hashCode());


	}
	
}
