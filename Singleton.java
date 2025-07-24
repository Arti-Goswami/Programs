package com.test;

public class Singleton {
	private static Singleton Singleton_instance =null;
	public String str;
	
	
	private Singleton() {
		// private constructor of class 
		str ="hey I am in Singleton class pattern";
	}

	public static Singleton getInstance() {
		if(Singleton_instance == null)
			Singleton_instance = new Singleton();
		return  Singleton_instance;
	}
	
	public static void main(String[] args) {
		Singleton x= Singleton.getInstance();
		Singleton y= Singleton.getInstance();
		Singleton z= Singleton.getInstance();
		x.str =(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str=(z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
