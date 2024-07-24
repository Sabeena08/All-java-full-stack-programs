package com.training;

public class MyAppImpl implements MyApp {

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("sum of two numbers :"+(a+b));
	}

	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "welcome to interface"+m;
		}
	public static void main(String[] args) {
		//interface reference variables holding its implementation class object
		MyApp mobj = new MyAppImpl();
		mobj.addition(30, 40);
		String ms=mobj.sayHello("raju");
		
		//2nd way
		MyAppImpl mobj1 = new MyAppImpl();
		mobj1.addition(30, 30);
		System.out.println(mobj.sayHello("raju"));
		
				
	}
	

}
