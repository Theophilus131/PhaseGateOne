
	import java.time.LocalDate;
	import java.util.Scanner;
	
	public class MenstrualApp{
	
	public static void calculateCycle(LocalDate startDate, int cycleLength){
	
	LocalDate safeBeforeStart = startDate;
    LocalDate safeBeforeEnd   = fertileStart.minusDays(1);
	
	LocalDate ovulationDate = startDate.plusDays(cycleLength - 14);
	
	LocalDate fertileStart = ovulationDate.minusDays(5);
	LocalDate fertileEnd = ovulationDate.plusDays(1);
	
	LocalDate safeAfterStart  = fertileEnd.plusDays(1);
    LocalDate safeAfterEnd    = nextPeriodDate.minusDays(1);
	
	
	System.out.println("\n  Results:");
	System.out.println("Next period starts on: " + nextPeriodDate);  
	System.out.println("Estimated ovulation day: " + ovulationDate);   
	System.out.println("Fertile window:         " + fertileStart + " to " + fertileEnd);
	System.out.println("Safe days before:       " + safeBeforeStart + " to " + safeBeforeEnd);
    System.out.println("Safe days after:        " + safeAfterStart  + " to " + safeAfterEnd);
	
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