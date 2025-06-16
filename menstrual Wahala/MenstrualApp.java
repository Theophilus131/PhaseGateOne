
	import java.time.LocalDate;
	import java.util.Scanner;
	
	public class MenstrualApp{
	
    public static LocalDate calculateNextPeriod(LocalDate startDate, int cycleLength) {
        return startDate.plusDays(cycleLength);
    }

    public static LocalDate calculateOvulationDate(LocalDate startDate, int cycleLength) {
        return startDate.plusDays(cycleLength - 14);
    }

    public static LocalDate calculateFertileStart(LocalDate ovulationDate) {
        return ovulationDate.minusDays(5);
    }

    public static LocalDate calculateFertileEnd(LocalDate ovulationDate) {
        return ovulationDate.plusDays(1);
    }

    public static LocalDate calculateSafeBeforeEnd(LocalDate fertileStart) {
        return fertileStart.minusDays(1);
    }

    public static LocalDate calculateSafeAfterStart(LocalDate fertileEnd) {
        return fertileEnd.plusDays(1);
    }

    public static LocalDate calculateSafeAfterEnd(LocalDate nextPeriod) {
        return nextPeriod.minusDays(1);
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

		LocalDate nextPeriod = calculateNextPeriod(startDate, cycleLength);
        
		LocalDate ovulationDate = calculateOvulationDate(startDate, cycleLength);
        
		LocalDate fertileStart = calculateFertileStart(ovulationDate);
        
		LocalDate fertileEnd = calculateFertileEnd(ovulationDate);
        
		LocalDate safeBeforeEnd = calculateSafeBeforeEnd(fertileStart);
        
		LocalDate safeAfterStart = calculateSafeAfterStart(fertileEnd);
        
		LocalDate safeAfterEnd = calculateSafeAfterEnd(nextPeriod);


	
	System.out.println("\n  Your Menstraul Results:");
	
	System.out.println("Next period starts on: " + nextPeriod); 
	
	System.out.println("Estimated ovulation day: " + ovulationDate);   
	
	System.out.println("Fertile window:         " + fertileStart + " to " + fertileEnd);
	
	System.out.println("Safe days before:       " + safeBeforeEnd + " to " + safeBeforeEnd);
    
	System.out.println("Safe days after:        " + safeAfterStart  + " to " + safeAfterEnd);

	
	

	}
	
}