package com.day11;

public interface X {
 abstract void method1();
 default void method2() {
	 System.out.println("inside default method in X");
 }
 static void method3() {
	 System.out.println("inside static in X");
}
}
