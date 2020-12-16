class SuggestionListNode
{
	private Suggestion suggestion;
	private SuggestionListNode next;

	public SuggestionListNode(Suggestion suggestion, SuggestionListNode next)
	{
		this.suggestion = suggestion;
		this.next = next;
	}
	public SuggestionListNode(Suggestion suggestion)
	{
		this.suggestion = suggestion;
		this.next = null;
	}

	public Suggestion getSuggestion(){return suggestion;}
	public SuggestionListNode getNext(){return next;}
}

