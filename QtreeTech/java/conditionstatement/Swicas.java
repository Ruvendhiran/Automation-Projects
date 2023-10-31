package conditionstatement;

public class Swicas {
	
	String myhero = "kamal";
	
	public void gussmyhero() {
		
		switch (myhero) {
		case "rajini":
			System.out.println("your hero rajini");
			break;
		case "kamal":
			System.out.println("your hero kamal");
			break;

		default:
			System.out.println("sorry i dont know");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swicas swi = new Swicas();
		swi.gussmyhero();

	}

}
