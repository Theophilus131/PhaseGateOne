import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberStudent = input.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numberSubject = input.nextInt();

        int[][] scores = new int[numberStudent][numberSubject];
	

        for (int i = 0; i < numberStudent; i++) {
            System.out.println("\nEntering scores for Student:" + (i + 1) + " : ");
		
	
            for (int j = 0; j < numberSubject; j++) {
		int score;
		while(true){
                System.out.print("Enter score for Subject: " + (j + 1) + " : ");
                score = input.nextInt(); 
		
		if(score >= 0 && score <= 100){
			scores[i][j] = score;
			break;
		} else{
		System.out.println("invalid number. enter scores from 0 - 100: ");
		}

            }
        }
}

        System.out.println("\nStudent Scores, Totals, and Averages:");
        for (int i = 0; i < numberStudent; i++) {
            int total = 0;
           
	 System.out.print("Student " + (i + 1) + " scores: ");
            for (int j = 0; j < numberSubject; j++) {
                System.out.print(scores[i][j] + " ");
                total += scores[i][j];
            }
            double average = (double) total / numberSubject;
            System.out.printf("    Total: %d   Average: %.2f%n", total, average);
	        }




   
    }
}
