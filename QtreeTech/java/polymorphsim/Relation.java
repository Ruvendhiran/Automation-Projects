package polymorphsim;

public class Relation {
	
	public void talk(Parents speakingstyle) {
		System.out.println("polite and truely");
	}

	public void talk(Partner speakingstyle) {
		System.out.println("with love and romatic.");
	}
	
	public static void main(String[] args) {
		
		Relation relation = new Relation();
		
		Parents patents = new Parents();
		relation.talk(patents);
		
        Partner partner = new Partner();
        relation.talk(partner);
	}

}
