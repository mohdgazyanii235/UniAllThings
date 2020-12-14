class Suggestion
{
	private Melody suggestion;
	private Melody solution;
	
	public Suggestion(Melody suggestion, Melody solution)
	{
		this.suggestion = suggestion;
		this.solution = solution;
	}

	public Melody getMelody()
	{
		return this.suggestion;
	}
	
	public int getNumCorrect()
	{
		return this.suggestion.getNumSamePosition(this.solution);
	}
	
	public int getNumOutOfOrder()
	{
		int correct = this.getNumCorrect();
		int numSameNoPosition = this.suggestion.getNumSameNoPosition(this.solution);
		return (numSameNoPosition - correct);
	}

	public boolean isCorrect()
	{
		for(int i = 0; i < this.solution.getLength(); i++)
		{
			if(this.solution.getNote(i) != this.suggestion.getNote(i))
			{
				return false;
			}
		}
		return true;

	}

	public String toString()
	{
		return (this.getMelody() + " Correct " + this.getNumCorrect()  + " Out of Order " + this.getNumOutOfOrder());
	}
}
