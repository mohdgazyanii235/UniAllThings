class Melody
{
	private char[] noteArray;

	public Melody(char[] noteArray)
	{
		this.noteArray = noteArray;
	}

	public char getNote(int i)
	{
		return(this.noteArray[i]);
	}

	public void setNote(int i, char note)
	{
		this.noteArray[i] = note;
	}

	public String toString()
	{
		String StringConcat = new String(this.noteArray);
		return(StringConcat.replace("", " ").trim());
	}
	
	public int getNumSamePosition(Melody other)   // This function will return notes that are positionally correct.
	{
		int counter = 0;
		for(int i = 0; i < this.noteArray.length; i++)
		{
			if(this.noteArray[i] == other.getNote(i))
			{
				counter = counter + 1;
			}
		}
		return(counter);
	}
  
	public int getNumSameNoPosition(Melody other)    // This function will return notes that are correct but improperly positioned.
	{
		char[] tempSuggestionArray = new char[5];
		for(int y = 0; y < 5; y++)
		{
			tempSuggestionArray[y] = other.getNote(y);
		}
		Melody tempSuggestionMelody = new Melody(tempSuggestionArray);

		int counter = 0;
		for(int i = 0; i < this.noteArray.length; i++)
		{
			for(int x = 0; x < this.noteArray.length; x++)
			{
				if(this.noteArray[i] == tempSuggestionMelody.getNote(x))
				{   // Change overlapping note to 'Z' so when the loop runs again, that overlap is ignored.
					tempSuggestionMelody.setNote(x, 'Z'); 
                    counter = counter + 1;
                    break;
				}
			}
		}
		return(counter);
	}
}
