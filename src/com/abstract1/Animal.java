package com.abstract1;

abstract class Animal {
	String eyeColor;	//ÑÛ¾¦ÑÕÉ«
	String furColor;	//Æ¤Ã«ÑÕÉ«
	int age;
	
	public Animal() {
		age = 0;
	}
	
	abstract void eat();
	abstract void run();
}
