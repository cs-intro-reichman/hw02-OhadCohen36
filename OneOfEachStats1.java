/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int numOffamilies = Integer.parseInt(args[0]);
		int count = 0;
		double average = 0;
		int twoChild = 0;
		int threeChild = 0;
		int fourplusChild = 0;
		double rand = Math.random();
		for(int i = 1; i <= numOffamilies; i++)
		{
			rand = Math.random();
			count = 1;
			if(rand <= 0.5)
			{
				rand = Math.random();
				while(rand <= 0.5)
				{
					rand = Math.random();
					count = count + 1;
				}
				count = count + 1;
			}
			else
			{
				rand = Math.random();
				while(rand >= 0.5)
				{
					rand = Math.random();
					count = count + 1;
				}
				count = count + 1;
			}
			if(count == 2)
				twoChild = twoChild + 1;
			if(count == 3)
				threeChild = threeChild + 1;
			if(count >= 4)
				fourplusChild = fourplusChild + 1;
			average = average + count;
		}
		String common;
		if(twoChild > threeChild){
			if(twoChild > fourplusChild){
				common = "2.";}
			else{
			common = "4 or more.";}
		}
		else{
			if(threeChild > fourplusChild){
				common = "3.";}
			else{
				common = "4 or more.";}
			}
		System.out.println("Average: " + average/numOffamilies + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChild);
		System.out.println("Number of families with 3 children: " + threeChild);
		System.out.println("Number of families with 4 children: " + fourplusChild);
		System.out.println("The most common number of children is " + common);
	}
}
