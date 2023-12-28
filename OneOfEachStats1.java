/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		boolean girl = false;
		boolean boy = false;
		int two = 0;
		int three = 0;
		int four = 0;
		int count = 1;
		double avg = 0.0;
		double rand = 0;
		for(int i = 1; i <= num; i++){
			rand = Math.random();
			while((boy != true) || (girl != true)){
				if(rand < 0.5){
					count++;
					girl = true;
				}
				else{
					count++;
					boy = true;
				}
				rand = Math.random();
			}
			avg = avg + count;
			if(count == 2){
				two++;
			}
			if(count == 3){
				three++;
			}
			if(count >= 4){
				four++;
			}
			girl = false;
			boy = false;
			count = 1;
		}
		avg = avg/num;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + four);
		if((two > three) && (two > four)){
			System.out.println("The most common number of children is 2.");
		}
		if((three > two) && (three > four)){
			System.out.println("The most common number of children is 3.");
		}
		if((four > two) && (four > three)){
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}
