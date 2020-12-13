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

	//Question 5 Scoring Starts from here:
	
	public int getNumSamePosition(Melody other)
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
//	['A', 'A', 'B', 'B', 'C']   = tempNoteArray
//	['A', 'C', 'B', 'B', 'B']   = other
  
	public int getNumSameNoPosition(Melody other)
	{
		int counter = 0;
		for(int i = 0; i < this.noteArray.length; i++)
		{
			for(int x = 0; x < this.noteArray.length; x++)
			{
				if(this.noteArray[i] == other.getNote(x))
				{
					other.setNote(x, 'Z');
					counter = counter + 1;
					break;
				}
			}
		}
		return(counter);
	}
}
