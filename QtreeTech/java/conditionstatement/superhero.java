package conditionstatement;

public class superhero {
	
	String myfavhero = "kamalhasan";
	
	public void superherogusser() {
		
		if(myfavhero.equals("rajini")) {
			System.out.println("your fav hero is rajini");
			
		}else if(myfavhero.equals("kamalhasan")){
			
			System.out.println("your fav hero kamal");
			
		}else if (myfavhero.equals("vikram")) {
			
			System.out.println("your fav hero is vikram");
			
		}else{
			System.out.println("sorry i dont know");
			
		}		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superhero hero = new superhero();
		hero.superherogusser();
		
		
		
		
	}

}
