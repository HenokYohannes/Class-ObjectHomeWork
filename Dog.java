package com.syntax.com15;

public class Dog {

String name;// Instance variable
String color; /// Istance Variable
static int noofLegs=4;
void sleep() {
	int time=3; //<--//local variables and we have to initialize them befor we use

	System.out.println(name+"is sleeping");
}
void eat() {
	// time is local variable we can not access it outside of sleep method
	System.out.println(name+"can eat");
}
}
