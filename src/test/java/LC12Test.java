import static org.junit.Assert.*;

public class LC12Test {

    @org.junit.Test
    public void intToRoman() {
       String actual1 = LC12.intToRoman(3);
       String actual2 = LC12.intToRoman(58);
       String actual3 = LC12.intToRoman(1994);

       assertEquals(actual1,"III");
        assertEquals(actual2,"LVIII");
        assertEquals(actual3,"MCMXCIV");
    }
}