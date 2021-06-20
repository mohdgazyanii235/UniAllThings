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
		return this.getMelody().getNumSamePosition(this.solution);
	}
	
	public int getNumOutOfOrder()
	{
		int correct = this.getNumCorrect();
		int numSameNoPosition = this.getMelody().getNumSameNoPosition(this.solution);
		return (numSameNoPosition - correct);
	}

	public boolean isCorrect()
	{
		for(int i = 0; i < 5; i++)
		{
			if(this.solution.getNote(i) != this.getMelody().getNote(i))
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
