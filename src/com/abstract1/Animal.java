package com.abstract1;

abstract class Animal {
	String eyeColor;	//�۾���ɫ
	String furColor;	//Ƥë��ɫ
	int age;
	
	public Animal() {
		age = 0;
	}
	
	abstract void eat();
	abstract void run();
}
