class Game
{
	private SuggestionListNode newSuggestionListNode;
	private Melody solution;
	public Game(Melody solution)
	{
		this.solution = solution;
		this.newSuggestionListNode = null;
	}

	public boolean suggestMelody(Melody suggestion)
	{
		Suggestion newSuggestion = new Suggestion(suggestion, this.solution);
		this.newSuggestionListNode = new SuggestionListNode(newSuggestion, this.newSuggestionListNode); 
		//Basically the newSuggestionListNode will always point to the latest suggestion.
		return this.newSuggestionListNode.getSuggestion().isCorrect();
	}

	public SuggestionListNode getHistory()
	{
		return this.newSuggestionListNode;
	}

	public Melody getSolution(){return this.solution;}

}
