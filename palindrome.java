// Name:Chancheep Mahacharoensuk	
// ID:u6288092
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word or phrase to check if it is a palindrome: ");
		String input = scanner.nextLine();
		String reInput = "";
		for(int i=input.length()-1;i>=0;i--)
		{
			reInput += input.charAt(i);
			//System.out.println(reInput);
		}
		if(input.replaceAll("\\s", "").equalsIgnoreCase(reInput.replaceAll("\\s", ""))) 
		{
	        System.out.println("The input word “"+ input +"” is a palindrome.");
		}
	    else 
	    {
	    	System.out.println("The input phrase “"+ input +"” is not a palindrome.");
	    }
	}
}
