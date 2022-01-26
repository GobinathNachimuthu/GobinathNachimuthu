package week1.day2;

public class ReverseEvenWords {
	public static void main(String[]args) {
		String test = " i am a software tester";
		//Split the words
		String[] words = test.split(" ");
		String revString = "";
		
		for(int i = 0; i < words.length;i++)
		{
			String word = words[i];
			String revWord = "";
			
			
		for(int j = word.length()-1;j>=0;j--) {
			revWord = revWord + word.charAt(j);
			if((i % 2)== 0);
			
		}
		revString = revString + revWord + "";
		}
		System.out.println(revString );
	}
	



	
	//if((i % 2)!= 0);
	{
	}
}
//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

/* Pseudo Code:
 
 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)

d)split the words and have it in an array

e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

 
*/