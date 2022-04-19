package com.foxminded.artem.task1;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AnagramsTest {

	@Test
	void reverseOnlyLettersWithWhitespace_shouldReturnReversedLettersInEveryWordWithWhitespaceBetween_WhenInputIsTwoWords()

	{
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String reversedString = anagrams.reverceLettersOnly("hello word");

		// Then
		assertTrue(reversedString.equals("olleh drow"));
	}

	@Test
	void reverseEmptyString_shouldReturnEmptyString_whenEmptyStringIsGivenAsAnImput() {
		// Given
		Anagrams anagrams = new Anagrams();
		String emptyString = "";

		// When
		String reversedString = anagrams.reverceLettersOnly(emptyString);

		// Then
		assertTrue(reversedString.equals(emptyString));
	}

	@Test
	void reverseOnlyLettersWithMultipleWhitespaces_shouldReturnReversedLettersInEveryWordWithWhitespacesBetween_WhenInputHasMoreThenTwoWords() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String reversedString = anagrams.reverceLettersOnly("hello word hello");

		// Then
		assertTrue(reversedString.equals("olleh drow olleh"));
	}

	@Test
	void reverseOnlyNumber_shouldReturnSameNumber_whenInputIsOneNumberOnly() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "1";

		// When
		String reversedString = anagrams.reverceLettersOnly(expectedAndGiven);

		// Then
		assertTrue(reversedString.equals(expectedAndGiven));
	}

	@Test
	void reverseOnlyOneLetter_shouldReturnSameLetter_whenInputIsOneLetterOnly() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "h";

		// When
		String reversedString = anagrams.reverceLettersOnly(expectedAndGiven);

		// Then
		assertTrue(reversedString.equals(expectedAndGiven));
	}

	@Test
	void reverseOnlyOneSpecialChar_shouldReturnSameChar_whenInputIsOneSpecialCharacterOnly() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "#";

		// When
		String reversedString = anagrams.reverceLettersOnly(expectedAndGiven);

		// Then
		assertTrue(reversedString.equals(expectedAndGiven));
	}

	@Test
	void reverseSameLetterMultipleTimes_shouldReturnSameCharSequence_whenInputIsMultipleRepetitionOfOneChar() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "aaaa";

		// When
		String reversedString = anagrams.reverceLettersOnly(expectedAndGiven);

		// Then
		assertTrue(reversedString.equals(expectedAndGiven));
	}

	@Test
	void reverseSameNumberMultipleTimes_shouldReturnSameNumberSequence_whenInputIsMultipleRepetitionOfOneNumber() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "1111";

		// When
		String reversedString = anagrams.reverceLettersOnly(expectedAndGiven);

		// Then
		assertTrue(reversedString.equals(expectedAndGiven));
	}

	@Test
	void reverseSameSpecCharMultipleTimes_shouldReturnSameSpecCharSequence_whenInputIsMultipleRepetitionOfOneSpecChar() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "#$%^&";

		// When
		String reversedString = anagrams.reverceLettersOnly(expectedAndGiven);

		// Then
		assertTrue(reversedString.equals(expectedAndGiven));
	}

	@Test
	void reverseTextWithLetterInDifferentCase_shouldReturnEveryLetterReversed_whenInputIsLetterInDifferentCase() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String reversedString = anagrams.reverceLettersOnly("AaAaAa");

		// Then
		assertTrue(reversedString.equals("aAaAaA"));
	}

	@Test
	void reverseOnlyLetters_shouldOnlyRevertLettersButSpecialCharsMustStay_whenInputIsLettersMixedWithSpecialChars() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String reversedString = anagrams.reverceLettersOnly("H#E$L%L^o!");

		// Then
		assertTrue(reversedString.equals("o#L$L%E^H!"));
	}

	@Test
	void reverseNumbersAndSpecCharsOnly_shouldReturnSameSequence_whenInputIsNumbersAndSpecialCharsOnly() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "1!2! !3!4";

		// When
		String reversedString = anagrams.reverceLettersOnly(expectedAndGiven);

		// Then
		assertTrue(reversedString.equals(expectedAndGiven));
	}

	@Test
	void reverseAllLettersInMultipleWords_shouldReverseEveryLetterInEachWord_whenInputIsLettersAndWhitespacesOnly() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String reversedString = anagrams.reverceLettersOnly("hello hello hello");

		// Then
		assertTrue(reversedString.equals("olleh olleh olleh"));
	}

	@Test
	void reverseOnlyLettersInMultipleWords_shouldReplaceLettersOnlyInEachWord_whenInputIsWordsAndSpecChars() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String reversedString = anagrams.reverceLettersOnly("HE!llo%^ w2or%%Ld! 29");

		// Then
		assertTrue(reversedString.equals("ol!lEH%^ d2Lr%%ow! 29"));
	}

	@Test
	void reverseOnlyLettersInMultipleWords_shouldReplaceLettersOnlyInEachWord_whenInputIsWordsAndNumbers() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String reversedString = anagrams.reverceLettersOnly("hell32o wo33rld");

		// Then
		assertTrue(reversedString.equals("olle32h dl33row"));
	}

	@Test
	void reverseOnlyLettersSeparatedWithMultipleWhitespaces_shouldReturnReversedWordsWithSameWhitespaceNumber_whenInputContainsMultipleWhitespaces() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String reversedString = anagrams.reverceLettersOnly("hell32o   wo33rld");

		// Then
		assertTrue(reversedString.equals("olle32h   dl33row"));
	}

	@Test
	void reverseNullString_shouldThrowIAException_whenNullIsGivenAsAnImput() {
		Anagrams anagrams = new Anagrams();
		String reversedString = null;
		assertThrows(IllegalArgumentException.class, () -> anagrams.reverceLettersOnly(reversedString));
	}
}
