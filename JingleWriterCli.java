import java.util.Scanner;

public class JingleWriterCli
{
	private static Scanner scan = new Scanner(System.in);

	// The melodyInput function is responsible for taking user input melody(as a string) and making "melody" out of it.
	private static Melody melodyInput()
	{
		System.out.println("Enter melody:");
		String melodyString = scan.nextLine();
		char[] melodyArray = new char[5];
		for(int i =0; i < melodyArray.length; i++)
		{
			melodyArray[i] = melodyString.charAt(i*2);
		}
		Melody suggestionMelody = new Melody(melodyArray);
		return suggestionMelody;
	}

	private static void historyPrinter(Game gameName)
	{
		System.out.println("History:");
		if(gameName.getHistory() == null)
		{
			System.out.println("No History");
		}
		else
		{
			for(SuggestionListNode counter = gameName.getHistory(); counter != null; counter = counter.getNext())
			{
				System.out.println(counter.getSuggestion());
			}
		}
	}

	public static void playGame(Game game)
	{
		while(true)
		{
			historyPrinter(game);
			Melody suggestionMelody = melodyInput();
			boolean result = game.suggestMelody(suggestionMelody);
			
			if(result == true)
			{
				System.out.println("Congratulations!");
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Game newGame = new Game();
		playGame(newGame);
	}
}
