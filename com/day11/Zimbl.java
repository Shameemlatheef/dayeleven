package com.day11;

public class Zimbl implements Z {
	@Override

	 public void method2() {
		 System.out.println("inside default method in X");
	 }
	public static void main(String[] args) {
		Z z=new Zimbl();
		z.method1();
		z.method2();
		z.method4();
		z.method5();
		z.methodZ();
		
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("inside nmethod X of method1");
		
	}
	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("inside method Y of method 4");
		
	}
	@Override
	public void methodZ() {
		// TODO Auto-generated method stub
		System.out.println("inside method z of methodZ");
		
	}
}
