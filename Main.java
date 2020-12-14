import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		char[] solutionArray = new char[5];
		for(int i = 0; i < solutionArray.length; i++)
		{
			solutionArray[i] = (char)('A' + rand.nextInt(7));
		}
		Melody solution = new Melody(solutionArray);
		System.out.println(solution);
	}
}
