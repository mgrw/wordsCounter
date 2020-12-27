import java.util.HashMap;
import java.util.Scanner;

public class DuplicateString {

	static void findDuplicateWord(String str)
	{
		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] s = str.split(" "); //split word by space
		
		for(String tempString : s)
		{
			System.out.println(tempString); // print all words separately
			
			if(hm.get(tempString) != null) // check if word value null or not
			{
				hm.put(tempString,hm.get(tempString) + 1); // add 1 for it
			}
			else
			{
				hm.put(tempString,1); // If word not entered to hash map before add for that word value 1
			}
	
		}
		System.out.println(hm); //print the word and it's value.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the sentence :");
		
		Scanner sc = new Scanner(System.in);
		
		String str= sc.nextLine(); //reads entered string and assign it to variable.
		
		findDuplicateWord(str);

	}

}
