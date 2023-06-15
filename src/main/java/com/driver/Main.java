package com.driver;

public class Main {
	public static void main(String[] args) {
		RWOnly obj = new RWOnly();
		obj.setName("Krishna"); // Setting value using setter function
		System.out.println(obj.getName()); // Accessing value using getter function
	}
}