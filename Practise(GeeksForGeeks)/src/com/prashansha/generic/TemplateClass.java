package com.prashansha.generic;

public class TemplateClass<T1,T2> {
	
	T1 t1obj;
	T1 t2obj;
	
	public TemplateClass(T1 t1obj,T1 t2obj)
	{
		this.t1obj=t1obj;
		this.t2obj=t2obj;
		
	}
	


	public void executeGenericClass()
	{
		
		System.out.println(t1obj.getClass().getName()+ " "+t1obj.toString());
		System.out.println(t2obj.getClass().getName()+ " "+t2obj.toString());
		System.out.println(t1obj);
	}

}
