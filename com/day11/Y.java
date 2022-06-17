package com.day11;

public interface Y {
	abstract void method4();
	 default void method5() {
		 System.out.println("inside default method in Y");
	 }
	 static void method6() {
		 System.out.println("inside static in Y");
	}
}
