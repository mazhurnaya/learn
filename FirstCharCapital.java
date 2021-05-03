package com.itbulls.mazhurna;
import java.util.Scanner;

public class FirstCharCapital {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please, enter any text: ");
			String userInput = sc.nextLine();
			
			
			System.out.println(firstCharToTitleCase(userInput));
		}

		public static String firstCharToTitleCase(String string){

			char[] words = string.toLowerCase().toCharArray();
boolean found = false;
for ( int i = 0; i < words.length; i++) {
	if (!found && Character.isLetter(words[i])) {
		words[i] = Character.toUpperCase(words[i]);
		found = true;
	} else if (Character.isWhitespace(words[i])) {
		found = false;
	}

			}
return string.valueOf(words);
			// rejoin back into a sentence
			//string = String.join(" ", words);
		}
}
