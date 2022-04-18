package com.foxminded.artem.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramsTest {

	@Test
	void reverseOnlyLettersWithWhitespace_shouldReturnReversedLettersInEveryWordWithWhitespaceBetween_WhenInputIsTwoWords()

	{
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput("hello word");

		// Then
		assertTrue(revertString.equals("olleh drow"));
	}

	@Test
	void reverseEmptyString_shouldReturnEmptyString() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput("");

		// Then
		assertTrue(revertString.equals(""));
	}

	@Test
	void reverseOnlyLettersWithMultipleWhitespaces_shouldReturnReversedLettersInEveryWordWithWhitespacesBetween_WhenInputHasMoreThenTwoWords() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput("hello word hello");

		// Then
		assertTrue(revertString.equals("olleh drow olleh"));
	}

	@Test
	void reverseOnlyNumber_shouldReturnSameNumber_whenInputIsOneNumberOnly() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "1";

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput(expectedAndGiven);

		// Then
		assertTrue(revertString.equals(expectedAndGiven));
	}

	@Test
	void reverseOnlyOneLetter_shouldReturnSameLetter_whenInputIsOneLetterOnly() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "h";

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput(expectedAndGiven);

		// Then
		assertTrue(revertString.equals(expectedAndGiven));
	}

	@Test
	void reverseOnlyOneSpecialChar_shouldReturnSameChar_whenInputIsOneSpecialCharacterOnly() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "#";

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput(expectedAndGiven);

		// Then
		assertTrue(revertString.equals(expectedAndGiven));
	}

	@Test
	void reverseSameLetterMultipleTimes_shouldReturnSameCharSequence_whenInputIsMultipleRepetitionOfOneChar() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "aaaa";

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput(expectedAndGiven);

		// Then
		assertTrue(revertString.equals(expectedAndGiven));
	}

	@Test
	void reverseSameNumberMultipleTimes_shouldReturnSameNumberSequence_whenInputIsMultipleRepetitionOfOneNumber() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "1111";

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput(expectedAndGiven);

		// Then
		assertTrue(revertString.equals(expectedAndGiven));
	}

	@Test
	void reverseSameSpecCharMultipleTimes_shouldReturnSameSpecCharSequence_whenInputIsMultipleRepetitionOfOneSpecChar() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "#$%^&";

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput(expectedAndGiven);

		// Then
		assertTrue(revertString.equals(expectedAndGiven));
	}

	@Test
	void revertTextWithLetterInDifferentCase_shouldReturnEveryLetterReversed_whenInputIsLetterInDifferentCase() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput("AaAaAa");

		// Then
		assertTrue(revertString.equals("aAaAaA"));
	}

	@Test
	void revertOnlyLetters_shouldOnlyRevertLettersButSpecialCharsMustStay_whenInputIsLettersMixedWithSpecialChars() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput("H#E$L%L^o!");

		// Then
		assertTrue(revertString.equals("o#L$L%E^H!"));
	}

	@Test
	void reverseNumbersAndSpecCharsOnly_shouldReturnSameSequence_whenInputIsNumbersAndSpecialCharsOnly() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "1!2! !3!4";

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput(expectedAndGiven);

		// Then
		assertTrue(revertString.equals(expectedAndGiven));
	}

	@Test
	void reverceAllLettersInMultipleWords_shouldReverceEveryLetterInEachWord_whenInputIsLettersAndWhitespacesOnly() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput("hello hello hello");

		// Then
		assertTrue(revertString.equals("olleh olleh olleh"));
	}

	@Test
	void reverseOnlyLettersInMultipleWords_shouldReplaceLettersOnlyInEachWord_whenInputIsWordsAndSpecChars() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput("HE!llo%^ w2or%%Ld! 29");

		// Then
		assertTrue(revertString.equals("ol!lEH%^ d2Lr%%ow! 29"));
	}

	@Test
	void reverseOnlyLettersInMultipleWords_shouldReplaceLettersOnlyInEachWord_whenInputIsWordsAndNumbers() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput("hell32o wo33rld");

		// Then
		assertTrue(revertString.equals("olle32h dl33row"));
	}

	@Test
	void reverseOnlyLettersSeparatedWithMultipleWhitespaces_shouldReturnReversedWordsWithSameWhitespaceNumber_whenInputContainsMultipleWhitespaces() {
		// Given
		Anagrams anagrams = new Anagrams();

		// When
		String revertString = anagrams.reverceAllLettersOnlyInInput("hell32o   wo33rld");

		// Then
		assertTrue(revertString.equals("olle32h   dl33row"));
	}

	@Test
	void reverseNullString_shouldThrowIAException_whenNullIsGivenAsAnImput() {
		Anagrams anagrams = new Anagrams();
		String revertString = null;
		assertThrows(IllegalArgumentException.class, () -> anagrams.reverceAllLettersOnlyInInput(revertString));
	}
}
