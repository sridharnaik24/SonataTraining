package com.sonata.funintf;
@FunctionalInterface
public interface Interf {
	void m1();
	default void m2() {System.out.print("Default");

}
}