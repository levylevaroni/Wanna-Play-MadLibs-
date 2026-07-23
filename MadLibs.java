// Lev Alder
import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {
        // Create Scanner object 
        Scanner input = new Scanner(System.in);
        // Prompt user for words
        System.out.println("Enter an adjective:");
        String adjective = input.nextLine();
        System.out.println("Enter a noun:");
        String noun = input.nextLine();
        System.out.println("Enter a verb:");
        String verb = input.nextLine();
        // Construct and print the sentence
        System.out.println("I saw a " + adjective + " " + noun + " " + verb + " at Woodward Park yesterday!");
        // Close scanner 
        input.close();
       }
}

