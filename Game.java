import java.util.Random;

class Game
{
	private SuggestionListNode newSuggestionListNode;
	private Melody solution;
	public Game(Melody solution)
	{
		this.solution = solution;
		this.newSuggestionListNode = null;
	}

	public Game()
	{
		Random rand = new Random();
		char[] solutionArray = new char[5];
		for(int i = 0; i < solutionArray.length; i++)
		{
			solutionArray[i] = (char)('A' + rand.nextInt(7)); // A + a random number till six. (0 will return A) & (6 will return G) 
		}
		
		this.solution = new Melody(solutionArray);
	}

	public boolean suggestMelody(Melody suggestion)
	{
		Suggestion newSuggestion = new Suggestion(suggestion, this.solution);
		this.newSuggestionListNode = new SuggestionListNode(newSuggestion, this.newSuggestionListNode); 
		return this.newSuggestionListNode.getSuggestion().isCorrect();
	}

	public SuggestionListNode getHistory()
	{
		return this.newSuggestionListNode;
	}

	public Melody getSolution()
	{
		return this.solution;
	}

}
