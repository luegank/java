package com.luegank.maventest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Hello,maven!");
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		aman nm = ac.getBean("aman",aman.class);
		nm.sayHi();
		String a = "hello2"; 
        String d = "hello";
        String e = d + 2;
        System.out.println(a.equals(e));
	}

	public int add(int a ,int b ){
		return a+b;
	}
	
	public int multiply(int a,int b){
		return a*b;
	}
}

