import java.util.Scanner;
import java.util.Random;

public class Choose {
	public static void main (String [] args){
		System.out.println("What is your name?");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println (name + ", would you like to play SAVE THE WORLD? y or n");
		Scanner yorn = new Scanner(System.in);
		String answer = yorn.nextLine();
		if (answer.equals("y")) {
			System.out.println("Good Luck!");
		} else if (answer.equals("n")) {
			System.out.println("Bye!");
			return;
		} else {
			System.out.println("Error! You did not enter a valid letter");
			System.out.println("Game will quit");
			return;
		}
	System.out.println("Choose your starting country, USA or Australia, U for USA or any other key");
	System.out.println("for Australia");
	String country = input.nextLine();
	String upcountry = country.toUpperCase();
	
	if (upcountry.equals("U")) {
		System.out.println("Welcome to the United States of America, please select your starting city, L for Langley, West Virginia or N for New York City, New York");
		String city = input.nextLine();
		String upcity = city.toUpperCase();
		if (upcity.equals("L")) {
			System.out.println("Welcome to Langley, please select your profession");
			System.out.println("Press A for High School Janitor or B to accept a job as an intelligence agent at the CIA");	
				}
			else if (upcity.equals("N")){
				System.out.println("Welcome to the Big Apple, please select your profession");
				System.out.println("Press A for costumed Mickey Mouse in Times Square or Press B to enter the NYPD police academy");
			}
			else {
				System.out.println("Error! You did not enter a valid letter");
				System.out.println("Game will quit");
				return;
			}
		String jobu = input.nextLine();
		String upjobu = jobu.toUpperCase();
		if (upjobu.equals("B")) {
			System.out.println("As the rate of gun violence escalates in the United States of America you are tragically one of seven victims in a shootout with a group of weapons smugglers");
			System.out.println("Game Over");
			return;	
		}
		else if (upjobu.equals("A")) {
			System.out.println("In the limited time you have off from your job, you become very involved with a certain hobby");
			System.out.println("Is this hobby, Press A - Mixed Martial Arts or Press B - Enviromentalism");
			String hobby = input.nextLine();
			String uphobby = hobby.toUpperCase();
			if (uphobby.equals("A")) {
				System.out.println("You decide to go pro.");
				System.out.println(" ");
				System.out.println("In your first professional fight, you get brutally knocked out in just 25 seconds");
				System.out.println(" ");
				System.out.println("Due to massive blood loss and CTE, you spend the rest of your life in special care");
				System.out.println(" ");
				System.out.println("Game Over");
				return;
			}
			else if (uphobby.equals("B")) {
				System.out.println("You quickly become a leader in your field, after a few years, you quit your day job and become a full time activist");
				System.out.println(" ");
				System.out.println("You go to the North Pole multiple times during your successful career and in one of your final conquests, you encounter a strange black box in the snow during a blizzard");
				System.out.println(" ");
				System.out.println("Your instinct tells you to open it, but it is getting difficult to see and the box is too heavy to carry back to camp.");
				System.out.println(" ");
				System.out.println("Do you - A - Return to camp and launch an expidition the next morning to find the box under the heavy snow or - B - Open the box?");
				String box = input.nextLine();
				String upbox = box.toUpperCase();
				if (upbox.equals("A")) {
					System.out.println("The next morning you launch your expidition");
					System.out.println(" ");
					System.out.println("Strangely, the box is not where you remember seeing it the night before");
					System.out.println(" ");
					System.out.println("That night, two carnivorous polar bears come and eat your entire crew");
					System.out.println(" ");
					System.out.println("Game Over");
					return;
				}
				else if (upbox.equals("B")) {
					System.out.println("The box opens. It says 'type in a number from 1-10 to stop global warming'");
					Random rand = new Random();
					int  n = rand.nextInt(10) + 1;
					System.out.println("Type in the random number, from 1-10");
					int code = input.nextInt();
					if (n == code) {
						System.out.println("You win!");
						return;
					}
					else {
						System.out.println("The box blows up in your face, you survive with massive scarring on your face but Global Warming is unfortunately not stopped");
						System.out.println(" ");
						System.out.println("You watch as planet earth slowly detiriorates");
						System.out.println("Game Over");
						return;
					}
				
					
				}
			}
		}
		else {
			System.out.println("Error! You did not enter a valid letter");
			System.out.println("Game will quit");
			return;
		}	
	}
	else {
		System.out.println("Welcome to Australia! Press A to continue");
		String continuation = input.nextLine();
		String upcontinue = continuation.toUpperCase();
		if (upcontinue.equals("A")){
		System.out.println("Tragically, a massive tsunami wipes out the entire country of Australia and surrounding island nations such as Fiji and Vanuatu and you were unable to be rescued");
		System.out.println("Game Over");
		}
		else {
			System.out.println("Error! You did not enter a valid letter");
			System.out.println("Game will quit");
			return;
		}
		}
	}
}


			




