package Excel;

public class returntype {
	
	
	int collectionamount = 3000;
	
	public int totalgivenamount() {
		
		System.out.println("i collected the amount"+ collectionamount + "send it to you");
		
		return collectionamount;
	}

	public static void main(String[] args) {
		
		returntype ruve = new returntype();
		
	int amount=	ruve.totalgivenamount();
	
	System.out.println("ruve got the amount"+ amount);

	}

}
