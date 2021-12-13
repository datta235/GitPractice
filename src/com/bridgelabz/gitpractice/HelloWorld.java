package com.bridgelabz.gitpractice;

public class HelloWorld
{
	public static final String NAME = "Datta";
	public static void main(String[] args)
	{
		System.out.println("Welcome to git practice");
		printName(NAME);
	}
	
	public static void printName(String name) {
		System.out.println("My name is : " + name);
	}

}
