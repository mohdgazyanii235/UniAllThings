import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Melody: ");
		String melodyString = scan.nextLine();
		String[] melodyStringArray = melodyString.split(" ");
		String melodyStringWithoutSpaces = "";
		for(String note : melodyStringArray)
		{
			melodyStringWithoutSpaces += note;
		}
		char[] melodyArray = melodyStringWithoutSpaces.toCharArray();
		for(char i : melodyArray)
		{
			System.out.println(i);
		}
	}
}
