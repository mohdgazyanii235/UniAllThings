class Suggestion
{
	private Melody suggestion;
	private Melody solution;
	public Suggestion(Melody suggestion, Melody solution)
	{
		this.suggestion = suggestion;
		this.solution = solution;
	}

	public Melody getMelody(){return this.suggestion;}
	public int getNumCorrect()
	{
		return 0;
	}
	public int getNumOutOfOrder()
	{
		return 0;
	}

	public String toString()
	{
		return this.suggestion + " Correct " + this.getNumCorrect() + " Out of Order " + this.getNumOutOfOrder();
	}
}
