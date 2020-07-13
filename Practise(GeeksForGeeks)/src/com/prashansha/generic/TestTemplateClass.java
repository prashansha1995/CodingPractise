package com.prashansha.generic;

public class TestTemplateClass {

	public static void main(String[] args) {
		
		TemplateClass<Integer,Integer> templateClassInteger=new TemplateClass<Integer, Integer>(1,2);
		templateClassInteger.executeGenericClass();
		
		TemplateClass<String,String> templateClassString=new TemplateClass<String, String>("testString1","testString2");
		templateClassString.executeGenericClass();
		
		UserTemplate userTemplate=new UserTemplate(1,"Prashansha");
		UserDetails userDetails=new UserDetails("Bareilly","U.P",25);
		TemplateClass<UserTemplate, UserDetails> templateClassUser=new TemplateClass(userTemplate, userDetails);
		templateClassUser.executeGenericClass();

	}

}
