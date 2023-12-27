
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double rand = Math.random();
		int count = 1;
		if(rand <= 0.5)
		{
			System.out.print("b ");
			rand = Math.random();
			while(rand <= 0.5)
			{
				System.out.print("b ");
				rand = Math.random();
				count = count + 1;
			}
			System.out.println("g ");
			count = count + 1;
		}
		else
		{
			System.out.print("g ");
			rand = Math.random();
			while(rand >= 0.5)
			{
				System.out.print("g ");
				rand = Math.random();
				count = count + 1;
			}
			System.out.println("b ");
			count = count + 1;
		}
		System.out.println("You made it... and you now have " + count + " children.");
	}
}
