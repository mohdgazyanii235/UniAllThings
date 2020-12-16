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

	public int getLength() //made this function to easily get the lenght of a melody. (maybe change this later cuz all melody is 5 char long.)
	{
		return this.noteArray.length;
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
  
	public int getNumSameNoPosition(Melody other)
	{
		char[] tempCharArray = new char[other.getLength()];
		for(int y = 0; y < other.getLength(); y++)
		{
			tempCharArray[y] = other.getNote(y);
		}
		Melody tempMelody = new Melody(tempCharArray);

		int counter = 0;
		for(int i = 0; i < this.noteArray.length; i++)
		{
			for(int x = 0; x < this.noteArray.length; x++)
			{
				if(this.noteArray[i] == tempMelody.getNote(x))
				{
					tempMelody.setNote(x, 'Z'); 
					counter = counter + 1;
					break;
				}
			}
		}
		return(counter);
	}
}
