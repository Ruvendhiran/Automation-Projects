package polymorphsim;

public class Partner extends Parents {
	
	public void Partner() {
		System.out.println("no i sell");
	}

	public static void main(String[] args) {
		
		Parents part = new Partner();
        part.father();
        part.Partner();
	}

}
