
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidateCardTest {
	
	@Test
	public void testShortInput() {
    String result = ValidateCard.validatingCardDetail("123");
    assertEquals("invalid card type", result);
}


    @Test
    public void testValidVisaCard() {

	String input = ValidateCard.validatingCardDetail("4111111111111111");
	String expected = "Visa";
	
	assertEquals(expected, input);
	
	}
	
	@Test
    public void testValidMasterCard() {

	String input = ValidateCard.validatingCardDetail("5399831619690403");
	String expected = "MasterCard";
	
	assertEquals(expected, input);
	
	}
	
	
	@Test
    public void testValidDiscoverCard() {

	String input = ValidateCard.validatingCardDetail("6011000000000004");
	String expected = "Discover";
	
	assertEquals(expected, input);
	
	}
	
	
	@Test
    public void testValidAmericanExpressCard() {

	String input = ValidateCard.validatingCardDetail("378282246310005");
	String expected = "American Express";
	
	assertEquals(expected, input);
	
	}
	
	
}

