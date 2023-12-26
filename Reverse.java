/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		string rev = args[0];
		for(int i = rev.length() - 1; i >= 0; i--)
		{
			System.out.println(rev.charAt(i));
		}
		if(rev.length%2 == 0)
		{
			System.out.println("The middle character is " + rev.charAt((rev.length()/2) + 1);
		}
		else
		{
			System.out.println("The middle character is " + rev.charAt(rev.length()/2));
		}
	}
}
