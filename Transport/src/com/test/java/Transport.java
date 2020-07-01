package com.test.java;

public class Transport {
	static void mode(String a)
	{
		System.out.println("Transporting mode is "+a);
	}
	static void mode(int b)
	{
		System.out.println("Transporting mode is "+b+" wheeler");
	}
	static void mode(String a,int b)
	{
		System.out.println("Transporting mode is "+a+" and then by "+b+" wheeler");
	}
	static void mode(int b,String a)
	{
		System.out.println("Transporting mode is "+b+" wheeler and then by "+a);
	}

	public static void main(String[] args) {
		mode("Aeroplane");
		mode(4);
		mode(2,"Train");
		mode("Car",3);

	}

}
