import java.util.Scanner;

public class MagpieRunner2P2
{
	public static void main(String[] args)
	{
		Magpie2P2 maggie = new Magpie2P2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}