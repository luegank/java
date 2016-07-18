package com.luegank.maventest;

public class aman{
	private String who;
	private int age;
	
	public void setWho(String a){
		who = a;
	}
	public String getWho(){
		return who;
	}
	
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public void sayHi(){
		System.out.println("I am "+who+","+age+"years old"+":Hello");
	}
}