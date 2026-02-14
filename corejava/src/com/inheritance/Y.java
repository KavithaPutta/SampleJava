package com.inheritance;

public class Y extends X {
	//Here X is parent class and Y is child class
	public void meth2() {
		System.out.println("This is Child class");
	}

	public static void main(String[] args) {
		//Y x=new Y();
		//x.meth1();
		//x.meth2();
		X y=new X();
		y.meth1();
		//y.meth2();-> error with this reference variable we cannot access 
		//the child properties by using parent object
		X a=new Y();
		a.meth1();
		//a.meth2();->error with this reference variable also we cannot access the child class properties
		//Y b=new X();->it cannot store the parent class object into child class ref variable
		//Y b=(Y)new X();->can I downcast to the parent object, there is no compile error but, we have to 
		                 //face the java.lang.classcastexception
		X c=new Y();//here c is parent ref variable
		Y d=(Y) c;// d is the child ref variable
		d.meth1();
		d.meth2();
		c.meth1();
		//c.meth2();->error
	}

}
