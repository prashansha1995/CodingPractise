package com.prashansha.designPatterns;

public class CallSingletonEx {

	public static void main(String[] args) {
	/**
	 * EagerIntializationSingleton EagerIntializationSingleton=
	 * new EagerIntializationSingleton();
	 * 
	 * Restricts the creation of new Object.
	 * 
	 */
		

		System.out.println(EagerIntializationSingleton.getInstance().hashCode());
	}

}
