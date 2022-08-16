package com.prashansha.designPatterns;

import java.util.List;

/**
 *  object is created at the time of classloading
      Drawback is - Object is created,even no one /client is using the object.So it is ideally created ,when of no use 
                     Exception is not handled while object creation.
      https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples 
 * @author pragupta33
 *
 */
public class SingletonEagerInitialization {
	
	private static SingletonEagerInitialization singletonObject=new SingletonEagerInitialization();
	
	private SingletonEagerInitialization()
	{
	}
	
	public static SingletonEagerInitialization getSingletopnInstance()
	
	{
		return singletonObject;
	}
	
	 void printSingletonEagerInitialization() {
		System.out.println("I am calling print method of SingletonEagerInitialization");
	}

}
