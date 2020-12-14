public class Main
{
	public static void main(String[] args)
	{
		char[] solutionChar = new char[] {'A','B','C','D', 'E'};
		Melody solutionMelody = new Melody(solutionChar);
		char[] suggestionChar = new char[] {'A','C','B','F','G'};
		Melody suggestionMelody = new Melody(suggestionChar);
		Suggestion suggestion = new Suggestion(solutionMelody, suggestionMelody);
		
//		System.out.println("Solution: " + solutionMelody);
//		System.out.println("Suggestion: " + suggestionMelody);
//
//		System.out.println(suggestion);
		System.out.println(solutionMelody.getNote(0));
		System.out.println(suggestionMelody.getNote(0));
		System.out.println(suggestionMelody.getNote(0) == solutionMelody.getNote(0));
	}

}
