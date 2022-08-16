package com.prashansha.designPatterns;

public class SingletonDriverClass {

	public static void main(String[] args) {
         
		//if you try to create  instance of Singleton class,it will create compile time error ,,since constructor is private ,,so it will ask to change
		//visibility of constructor 
		
//		SingletonEagerInitialization singletonObjEx=new SingletonEagerInitialization();
		SingletonEagerInitialization singletonObj=SingletonEagerInitialization.getSingletopnInstance();
		
		singletonObj.printSingletonEagerInitialization();
		
		
		SingletonEagerIntializationUsingStaticBlock[] array=SingletonEagerIntializationUsingStaticBlock.getInstanceofSingletonUsingStaticBlock();
	    for(SingletonEagerIntializationUsingStaticBlock obj:array)
	    {
	    	obj.printSingletonEagerIntializationUsingStaticBlock();
	    }
	}

}
