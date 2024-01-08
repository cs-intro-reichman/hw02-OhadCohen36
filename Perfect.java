/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 1;
		String perfect = num + " is a perfect number since " + num + " = 1";
		// TODO: added empty line here
		for(int i = 2; i < num; i++ )
		{
			if(num%i == 0)
			{
				sum = sum + i;
				perfect = perfect + " + " + i;
			}
		}
		// TODO: added empty line here
		if (sum == num)
			System.out.println(perfect);
		else
			System.out.println(num + " is not a perfect number");
	}
}
