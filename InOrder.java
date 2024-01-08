/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		double lowRand = (Math.random()*10);
		System.out.print((int)(lowRand) + " ");
		double newRand = (Math.random()*10); // TODO: put empty line after this line for breathing...it's more readable
		while(lowRand <= newRand) {
			System.out.print((int)(newRand) + " ");
			lowRand = newRand;
			newRand = (Math.random()*10);
		}
	}
}
