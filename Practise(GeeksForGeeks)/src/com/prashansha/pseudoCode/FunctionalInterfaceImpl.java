package com.prashansha.pseudoCode;

public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
		FunctionInterfaceEx val=(int a ,int b)-> (a + b);
              int sum=val.calculate(2, 3);
              System.out.println(sum);
              
           val.deafultMethod1();
           val.deafultMethod2();
           
           FunctionInterfaceEx.staticMethod1();
           
}


}
