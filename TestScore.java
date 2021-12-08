import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		System.out.println("Please enter exam scores from 0 to 100?");
		System.out.println("To stop program type 999");
		System.out.println();
		
		
		//initiate variables and create scanner object
		double scoreTotal = 0.0;
		int scoreCount = 0;
		int testScore = 0;
		Scanner ri = new Scanner(System.in);
		
		//get series of test score from user 
		while(testScore <= 100){
			
			//get input from user 
			System.out.print("Enter score: ");
		testScore = ri.nextInt();
	
		//store score count and score total
		if(testScore <= 100){
			scoreCount = scoreCount + 1;
			scoreTotal = scoreTotal + testScore;
		}
}

		//display score count, score total, average score
		double averageScore = scoreTotal / scoreCount;
		String message = "\n" 
				+ "score count:   " + scoreCount + "\n"
				+ "Score total:   " + scoreTotal + "\n"
				+ "Exam Average: " + averageScore + "\n";
		System.out.println(message);
}
}