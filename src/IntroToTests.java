import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntroToTests {

	@Test
	public void test() {
		assertEquals(7, add(3, 4));
		assertEquals(25, square(5));
		assertEquals("Hi bob", giveGreeting("bob"));
		assertEquals("Hi bob!!!", giveEnthusiasticGreeting("bob"));
		assertEquals(false, isWeekend("Tuesday"));
		assertEquals(true, isWeekend("Sunday"));
		assertEquals("A", getLetterGrade(95.0D));
		assertEquals("B", getLetterGrade(88.0D));
		assertEquals("C", getLetterGrade(72.0D));
		assertEquals("D", getLetterGrade(61.0D));
		assertEquals("F", getLetterGrade(41.0D));
		assertEquals("stuffstuffstuff", repeatString("stuff", 3));
		assertEquals("stuff*-*stuff*-*stuff", repeatStringWithSeperator("stuff", "*-*", 3));

	}

	public int add(int a, int b) {
		return a + b;
	}

	public int square(int a) {
		return a * a;
	}

	public String giveGreeting(String s) {
		return "Hi " + s;
	}

	public String giveEnthusiasticGreeting(String s) {
		return "Hi " + s + "!!!";
	}

	public boolean isWeekend(String s) {
		if (s.equalsIgnoreCase("Saturday") || s.equalsIgnoreCase("Sunday")) {
			return true;
		}
		return false;
	}

	public String getLetterGrade(double Grade) {
		if (Grade >= 90) {
			return "A";
		} else if (Grade <= 89 && Grade >= 80) {
			return "B";
		} else if (Grade <= 79 && Grade >= 70) {
			return "C";
		} else if (Grade <= 69 && Grade >= 60) {
			return "D";
		}
		return "F";

	}

	public String repeatString(String s, int Timez) {
		String ret = "";
		for (int i = 0; i < Timez; i++) {
			ret += s;
		}
		return ret;
	}

	public String repeatStringWithSeperator(String s, String sep, int Timez) {
		String ret = "";
		for (int i = 0; i < Timez; i++) {
			if (i + 1 != Timez) {
				ret += s;
				ret += sep;
			} else {
				ret += s;
			}

		}
		return ret;
	}
}
