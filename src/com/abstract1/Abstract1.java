package com.abstract1;

public class Abstract1 {

	public static void main(String[] args) {
		//Animal a = new Animal();	//A行，抽象类不能被实例化；抽象类不能使用new关键字创建实例化对象
		Cat2 tom = new Cat2();
		tom.eat();
		tom.run();
	}

}
