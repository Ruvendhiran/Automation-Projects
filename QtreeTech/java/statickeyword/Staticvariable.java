package statickeyword;

public class Staticvariable {
	
static int maruthicylinder = 0;
String wheels;    	   
   
	public static void main(String[] args) {
		Staticvariable obj1 = new Staticvariable();
		maruthicylinder = 4;
		obj1. wheels = "four";
		
		Staticvariable obj2 = new Staticvariable();
		maruthicylinder  = 6;
		obj2.wheels = "six";
		
		System.out.println("obj1 int" + maruthicylinder);
		System.out.println("obj1 String;" + obj1.wheels);
		System.out.println("obj2 int" + maruthicylinder);
		System.out.println("obj2 String;" + obj2.wheels);
	}

}
