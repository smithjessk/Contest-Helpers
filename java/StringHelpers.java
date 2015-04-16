public class StringHelpers {
	// Return, e.g., 0 for 'a' or 'A', 1 for 'b' or 'B', ... , 25 for 'z' or 'Z'
	public static int getIndexOfLetter(char c) {
		return (int)(Character.toLowerCase(c) - 'a');
	}

	// TODO: Explain this method in English for memory's sake
	public static String caesarShift(String str, int shiftValue){
		String out = "";
		for(int i = 0; i < str.length(); i++) {
			// out += (char)((( (str.toLowerCase().charAt(i) - 'a') + shiftValue ) % 26) + 'a');
			int shiftedIndex = (getIndexOfLetter(str.charAt(i)) + shiftValue) % 26;
			out += (char)(shiftedIndex + 'a');
		}
		return out;
	}

	/*
	*  I took a look at the stuff for changing bases and there's a way in the
	*  Java API, using the Integer class:
	*
	*  To convert to another base:
	*  Integer.toString(int num, int base);
	*
	*  To convert from a base to normal number:
	*  Integer.parseInt(String number_representation, int base);
	*  
	*  So for example, to change from binary to hex:
	*  int binary = 10;
	*  String hexValue = Integer.toString(Integer.parseInt(binary, 2), 16);/
	*/
}
