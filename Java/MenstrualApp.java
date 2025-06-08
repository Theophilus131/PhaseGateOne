
	import java.time.LocalDate;
	import java.util.Scanner;
	
	public class MenstrualApp{
	
	public static void calculateCycle(LocalDate startDate, int cycleLength){
	
	
	public static LocalDate calculateNextPeriod(LocalDate startDate, int cycleLength) {
        return startDate.plusDays(cycleLength);
    }	
		
		
	public static void LocalDate ovulationDate(LocalDate startDate, int cycleLength){
		
		return startDate.plusDays(cycleLength - 14);
	}
	
	
	//LocalDate nextPeriod = startDate.plusDays(cycleLength);
	
	//LocalDate ovulationDate = startDate.plusDays(cycleLength - 14);
	
	
	LocalDate fertileStart = ovulationDate.minusDays(5);
	LocalDate fertileEnd = ovulationDate.plusDays(1);
	
	
	LocalDate safeBeforeStart = startDate;
    LocalDate safeBeforeEnd   = fertileStart.minusDays(1);
	
	
	LocalDate safeAfterStart  = fertileEnd.plusDays(1);
    LocalDate safeAfterEnd    = nextPeriod.minusDays(1);
	
	
	System.out.println("\n  Results:");
	System.out.println("Next period starts on: " + nextPeriod); 
	System.out.println("Estimated ovulation day: " + ovulationDate);   
	System.out.println("Fertile window:         " + fertileStart + " to " + fertileEnd);
	System.out.println("Safe days before:       " + safeBeforeStart + " to " + safeBeforeEnd);
    System.out.println("Safe days after:        " + safeAfterStart  + " to " + safeAfterEnd);
	
	}

	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
	
	
	System.out.println("Welcom to Tphils Menstrual App ");

	LocalDate startDate = null;
	
	while(true){
	System.out.println("Enter the first day of your last period (YYYY-MM-DD): ");
	String lastPeriodDate = input.nextLine();
	
	try {
	 startDate = LocalDate.parse(lastPeriodDate);
	break;
	} catch (Exception e){
		System.out.println("invalid date format! enter the date as (YYYY-MM-DD)");
	}
	}
	
	
	int cycleLength = 0;
	while(true){
	System.out.println("Enter your aveage cycle length: ");
	cycleLength = input.nextInt();
	
	if (cycleLength >= 21 && cycleLength <= 35) {
    break;
	} else {
    System.out.println("Invalid cycle length. Please enter a value between 21 and 35 days.");
	}
	
}
	
	calculateCycle(startDate, cycleLength);
	

	}
	
}