/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String rev = args[0];
		for(int i = (rev.length() - 1); i >= 0; i--){
			System.out.print(rev.charAt(i));
		}
		System.out.println();
		System.out.println("The middle character is " + rev.charAt((rev.length()/2)));
	}
}
