package statickeyword;

public class Ststicmethod {
	
	public static void method1() {
		System.out.println("method 1 is nothing");
	}

	public void method2() {
		
		System.out.println("method 2 is non static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    method1();
    Ststicmethod method = new Ststicmethod();
    method.method2();
	}

}
