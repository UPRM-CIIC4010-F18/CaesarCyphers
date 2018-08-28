
public class CaesarCypher {

	private int key;
	
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static String shiftedAlphabet;
	
	public CaesarCypher(int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0, key);
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;
	}
	
	
}
