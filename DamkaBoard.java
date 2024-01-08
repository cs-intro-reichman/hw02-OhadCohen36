/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i <= num; i++) // TODO: instead of i and j, better naming would be row and col
		{
			for(int j = 1; j <= num; j++)
			{
				if(i%2 == 1)
					System.out.print("* ");
				else
					System.out.print(" *");
			}
			System.out.println();
		}
	}
}
