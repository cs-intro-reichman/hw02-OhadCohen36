/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		double frstRand = Math.random()*10;
		System.out.print((int)(frstRand) + " ");
		double rand = Math.random()*10;
		while(frstRand <= rand);
		{
			System.out.print((int)(rand) + " ");
			rand = Math.random()*10;
		}
	
	}
}
