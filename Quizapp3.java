
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Quizapp3 {

	public static void main(String[] args) {

		boolean y = true, n = false;

		Scanner scan1 = new Scanner(System.in);
		// array list
		ArrayList<Integer> gradelist = new ArrayList<>();

		while (true) {
		
			System.out.println("Enter a grade  :");

			int grade = scan1.nextInt();

			gradelist.add(grade);
			
			System.out.println("Would you like to enter more grades : [y/n]");
			scan1.nextLine(); 
			String response = scan1.nextLine();

			if (response.startsWith("y")) continue;
				

			if (response.startsWith("n"))	break;
			
			
		}
			int highestgrade = Collections.max(gradelist);
			int lowestgrade = Collections.min(gradelist);
			double averagegrade = gradelist.stream().mapToInt(s->s).average().orElse(0.0);
			long numA = gradelist.stream().count();
					 
			
		// What was the highest score?
		// What was the lowest score?
		// What was the average score for the class?
		// How many students got an A (90+)?
		// How many students got a B (80 - 89)?
		// How many students got a C (70 - 79)?
		// How many students failed (69 or lower)?

	}
}
