package com.prashansha.designPatterns;

/**
 * Link to Refer
 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 * @author pragupta33
 *
 */
public class EagerIntializationSingleton {

	
	 private static final EagerIntializationSingleton instance = 
			 new EagerIntializationSingleton();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerIntializationSingleton(){}

	    public static EagerIntializationSingleton getInstance(){
	        return instance;
	    }

}
