
	import java.time.LocalDate;
	import java.util.Scanner;
	
	public class MenstrualApp{
	
	public static void calculateCycle(LocalDate startDate, int cycleLength){
	
	LocalDate ovulationDate = startDate.plusDays(cycleLength - 14);
	
	}

	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
	
	
	System.out.println("Welcom to Tphils Menstrual App ");

	System.out.println("Enter the first day of your last period (YYYY-MM-DD): ");
	String lastPeriodDate = input.nextLine();
	
	LocalDate startDate = LocalDate.parse(lastPeriodDate);
	
	System.out.println("Enter your aveage cycle length: ");
	int cycleLength = input.nextInt();
	
	 calculateCycle(startDate, cycleLength);
	

	}
	
}