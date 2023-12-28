/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int numOffamilies = Integer.parseInt(args[0]);
		boolean Girl = false;
		boolean Boy = false;
		double average = 0;
		int twoChild = 0;
		int threeChild = 0;
		int fourplusChild = 0;
		int count = 0;
		for(int i = 1; i <= numOffamilies; i++)
		{
			while((Boy != true) || (Girl != true)){
				if(Math.random() < 0.5){
					Girl = true;
					count++;
				}
				else{
					Boy = true;
					count++;
				}
			}
			average = average + count;
			if(count == 2){
				twoChild++;}
			if(count == 3){
				threeChild++;}
			if(count >= 4){
				fourplusChild++;}
			Boy = false;
			Girl = false;
			count = 0;
		}
		System.out.println("Average: " + average/numOffamilies + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChild);
		System.out.println("Number of families with 3 children: " + threeChild);
		System.out.println("Number of families with 4 children: " + fourplusChild);
		if((twoChild >= threeChild) && (twoChild >= fourplusChild))
				System.out.println("The most common number of children is 2.");
		if((threeChild > twoChild) && (threeChild > fourplusChild))
				System.out.println("The most common number of children is 3.");
		if((fourplusChild > twoChild) && (fourplusChild > threeChild))
				System.out.println("The most common number of children is 4 or more.");
	}
}
