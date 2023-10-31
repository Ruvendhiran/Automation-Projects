package Constructor;

public class animal {
	
	String animalname;
	String animaltype;
	
	animal(String name , String type){
		animalname=name;
		animaltype=type;
	}
	
	public void sayaboutanimal() {
		
		System.out.println("the animal name is"+ animalname +"animal type is"+ animaltype );
		
	}

	public static void main(String[] args) {
	
		animal animal = new animal("lion" , "omnivorus");
	
		animal.sayaboutanimal();
	}

}