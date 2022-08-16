package com.prashansha.pseudoCode;

import java.util.List;

public final class  ImmutableClassEx extends Thread  implements Runnable,List{
	
	private  final int x;
	private  final int y;
	
	public ImmutableClassEx(int x ,int y)
	{
	this.x=x;
	this.y=y;
	}
	

	public static void main(String[] args) {
		ImmutableClassEx obj=new ImmutableClassEx(3,4);
		System.out.println("X is "+obj.x);
		System.out.println("Y is "+obj.y);
		

	}

}
