
public class Main {

	public static void main(String[] args) {
		
		CaesarCypher c = new CaesarCypher(3);
		
		String clear = "HELLO"; // H -> K  E -> H  L -> O, O -> R
		
		String cyphered = c.encode(clear);
		
		String correct = "KHOOR";
		
		System.out.println(cyphered);
		
	}
	
}
