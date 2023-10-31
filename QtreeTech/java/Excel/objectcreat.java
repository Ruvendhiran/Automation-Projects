package Excel;

public class objectcreat {
	
	long accountnumber = 12347910l;
	String accountholder = "Ruve";
	Integer accountbalance = 350;
	
	public void getaccountholder() {
		
		System.out.println("The account holder name is "+ accountholder);
	}

	public static void main(String[] args) {
		
		objectcreat R = new objectcreat();
		
		R.getaccountholder();

	}

}
