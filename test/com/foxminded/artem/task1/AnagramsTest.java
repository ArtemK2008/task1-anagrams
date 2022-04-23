package com.foxminded.artem.task1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class AnagramsTest {
	
	@Test
	void reverseEmptyString_shouldReturnEmptyString_whenEmptyStringIsGivenAsAnImput() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expected = "";
		// When
		String actual = anagrams.reverceLettersOnlyEachWord("");
		// Then
		assertEquals(expected,actual);
	}
	
	@ParameterizedTest
	@CsvSource({
		"aaaa,aaaa" ,
		"AaAa,aAaA" ,
	"hello word,olleh drow" ,
	"hello word hello,olleh drow olleh",
	"hello hello hello,olleh olleh olleh",
	
	})
	void reverseOnlyLetters_shouldReturnReversedLettersOnlyInEveryWord_whenInputsAreLettersOnly(String given, String output)
	{
		// Given
		Anagrams anagrams = new Anagrams();
		// When
		String actual = anagrams.reverceLettersOnlyEachWord(given);
		String expected = output;
		// Then
		assertEquals(expected,actual);
	}	
		
	@ParameterizedTest
	@ValueSource(strings = {"1","h","#", "1111","#$%^&"})
	void reverseOnlyNumber_shouldReturnTheSameString_whenInputAreNotLetters(String argString)
	{
		Anagrams anagrams = new Anagrams();
		String expected = argString;
		
		String actual = anagrams.reverceLettersOnlyEachWord(argString);
		
		assertEquals(expected,actual);
	}

	@Test
	void reverseOnlyLetters_shouldOnlyRevertLettersButSpecialCharsMustStay_whenInputIsLettersMixedWithSpecialChars() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expected = "o#L$L%E^H!";
		// When
		String actual = anagrams.reverceLettersOnlyEachWord("H#E$L%L^o!");
		// Then
		assertEquals(expected,actual);
	}

	@Test
	void reverseNumbersAndSpecCharsOnly_shouldReturnSameSequence_whenInputIsNumbersAndSpecialCharsOnly() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expectedAndGiven = "1!2! !3!4";
		// When
		String reversedString = anagrams.reverceLettersOnlyEachWord(expectedAndGiven);
		// Then
		assertEquals(expectedAndGiven,reversedString);
	}


	@Test
	void reverseOnlyLettersInMultipleWords_shouldReplaceLettersOnlyInEachWord_whenInputIsWordsAndSpecChars() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expected = "ol!lEH%^ d2Lr%%ow! 29";
		// When
		String actual = anagrams.reverceLettersOnlyEachWord("HE!llo%^ w2or%%Ld! 29");
		// Then
		assertEquals(expected,actual);
	}

	@Test
	void reverseOnlyLettersInMultipleWords_shouldReplaceLettersOnlyInEachWord_whenInputIsWordsAndNumbers() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expected = "olle32h dl33row";
		// When
		String actual = anagrams.reverceLettersOnlyEachWord("hell32o wo33rld");
		// Then
		assertEquals(expected,actual);
	}

	@Test
	void reverseOnlyLettersSeparatedWithMultipleWhitespaces_shouldReturnReversedWordsWithSameWhitespaceNumber_whenInputContainsMultipleWhitespaces() {
		// Given
		Anagrams anagrams = new Anagrams();
		String expected = "olle32h   dl33row";
		// When
		String actual = anagrams.reverceLettersOnlyEachWord("hell32o   wo33rld");
		// Then
		assertEquals(expected,actual);
	}

	@Test
	void reverseNullString_shouldThrowIAException_whenNullIsGivenAsAnImput() {
		Anagrams anagrams = new Anagrams();
		String reversedString = null;
		assertThrows(IllegalArgumentException.class, () -> anagrams.reverceLettersOnlyEachWord(reversedString));
	}
}
