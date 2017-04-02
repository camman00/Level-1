package me.Advance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		assertEquals("etatttt", weaveStrings("eatt", "ttt"));
	}

	@Test
	public void test2() {
		assertEquals("t", removeVowels("eat"));
	}

	@Test
	public void test3() {
		assertEquals("toboRtoboR", reverseRepeat("Robot"));
	}

	private String weaveStrings(String one, String two) {
		String finalString = "";
		String combined = one + two;
		char[] CharAr = combined.toCharArray();
		int Sone = 0;
		int Tone = one.length();
		for (int i = 0; i < CharAr.length; i++) {
			if (Sone < one.length()) {
				finalString += CharAr[Sone];
				Sone += 1;
			}
			if (Tone < two.length() + one.length()) {
				finalString += CharAr[Tone];
				Tone += 1;
			}

		}
		return finalString;

	}

	private String removeVowels(String remove) {
		String finalString = "";
		for (char c : remove.toCharArray()) {
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
				finalString += c;
			}
		}
		return finalString;
	}

	private String reverseRepeat(String reverse) {
		String finalString = "";
		char[] charAr = reverse.toCharArray();
		for (int i = reverse.length(); i > 0; i--) {
			finalString += charAr[i - 1];
		}
		finalString += finalString;
		return finalString;
	}

}
// public static void volatile strictfp transient