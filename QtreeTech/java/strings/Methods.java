package strings;

public class Methods {

	public static void main(String[] args) {
		
		String name = "Ruvendhiran";
		
		int number = 3;

		System.out.println(name.charAt(0));
		
		System.out.println(name.length());
		
		System.out.println(name.equalsIgnoreCase("ruvendhiran"));
		
		System.out.println(name.equals("ruve"));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.contains("R"));
		
		System.out.println(name.substring(2));
		
		System.out.println(name.substring(2, 6));
		
		System.out.println(name.concat("siva"));
		
		System.out.println(name.replace("Ruvendhiran", "Siva"));
		
		System.out.println(name.indexOf("r", 0));
		
		System.out.println(name.trim());
		
		System.out.println(String.valueOf(number));
		
		System.out.println(String.join(name, args));

	}

}
