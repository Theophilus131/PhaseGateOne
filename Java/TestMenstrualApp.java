
	 import org.junit.jupiter.api.Test;
	 import java.time.LocalDate;
	 import static org.junit.jupiter.api.Assertions.assertEquals;

	public class TestMenstrualApp{
	
	@Test
	public void testThatFunctionExist(){
	MenstrualApp.calculateNextPeriod(LocalDate.of(2025, 6, 6), 28);

	}

	@Test
	public void testThatNextPeriodIsCorrect(){
	LocalDate actual = MenstrualApp.calculateNextPeriod(LocalDate.of(2025, 6, 6), 28);
        LocalDate expected = LocalDate.of(2025, 7, 4);
        assertEquals(expected, actual);

}
	
	@Test
	public void testThatOvulationIsCorrect(){
	LocalDate actual = MenstrualApp.calculateOvulationDate(LocalDate.of(2025, 6, 1), 28);
        LocalDate expected = LocalDate.of(2025, 6, 15);
        assertEquals(expected, actual);

}

	
	
	
	
	
	
}