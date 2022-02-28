package org.collectionmap;

public class Sample {

	static int b; //global variable or instance variable
	//static variable
	
	private void employee() {
		int a=0; //local variable
		System.out.println(a);
		
	}
	
	private void empl1() {
		System.out.println(b);

	}
	public static void main(String[] args) {
		Sample s = new Sample();
		
		System.out.println(s.b);
		
	}
}
