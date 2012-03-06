package singletonPattern;

public class Singleton {
	private static Singleton singleton=new Singleton();
	private Singleton(){
		System.out.println("Object has been build...");
	}
	public static Singleton getInstance(){
		return singleton;
	}
}
