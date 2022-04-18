package com.foxminded.artem.task1;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AnagramsTest {

	@Test
	void testRevertOneWord() {
		//Given
		Anagrams anagrams = new Anagrams();
		
		//When
		String revertedWord = anagrams.revertOneWord("hello");
		
		//Then
		assertTrue(revertedWord.equals("olleh"));
	}

	@Test
	void testSplitInputByWord() {
		//Given
		Anagrams anagrams = new Anagrams();
		
		//When
		String[] splitString = anagrams.splitInputByWord("hello how are you");
		
		//Then
		assertTrue(Arrays.equals(splitString, new String[] {"hello","how","are","you"}));	
	}

	@Test
	void testRevertStringWithOneWhitespace() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("hello word");
				
				//Then
				assertTrue(revertString.equals("olleh drow"));	
			}
	
	@Test
	void testRevertEmptyString() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("");
				
				//Then
				assertTrue(revertString.equals(""));	
			}
	
	@Test
	void testRevertWithFewWhitespaces() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("hello word hello");
				
				//Then
				assertTrue(revertString.equals("olleh drow olleh"));	
			}
	
	@Test
	void testRevertWithOneNumber() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("1");
				
				//Then
				assertTrue(revertString.equals("1"));	
			}
	@Test
	void testRevertWithOneLetter() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("h");
				
				//Then
				assertTrue(revertString.equals("h"));	
			}
	
	@Test
	void testRevertWithOneSpecialCharacter() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("#");
				
				//Then
				assertTrue(revertString.equals("#"));	
			}
	@Test
	void testRevertOneLetterFewTimes() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("aaaa");
				
				//Then
				assertTrue(revertString.equals("aaaa"));	
			}

	@Test
	void testRevertWithOneNumberFewTimes() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("1111");
				
				//Then
				assertTrue(revertString.equals("1111"));	
			}
	@Test
	void testRevertWithOneLetterInDifferentCases() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("AaAaAa");
				
				//Then
				assertTrue(revertString.equals("aAaAaA"));	
			}
	@Test
	void testRevertOnlySpecial() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("#$%^&");
				
				//Then
				assertTrue(revertString.equals("#$%^&"));	
			}
	@Test
	void testRevertSpecialCharsWithLettersInOneWord() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("H#E$L%L^o!");
				
				//Then
				assertTrue(revertString.equals("o#L$L%E^H!"));	
			}
	@Test
	void testRevertSpecialCharsWithNumbers() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("1!2! !3!4");
				
				//Then
				assertTrue(revertString.equals("1!2! !3!4"));	
			}
	@Test
	void testRevertFewWordsWithoutNumsAndChars() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("hello hello hello" );
				
				//Then
				assertTrue(revertString.equals("olleh olleh olleh"));				
			}
	@Test
	void testRevertFewWordsWithNumsAndChars() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("HE!llo%^ w2or%%Ld! 29" );
				
				//Then
				assertTrue(revertString.equals("ol!lEH%^ d2Lr%%ow! 29"));				
			}
	@Test
	void testRevertFewWordsWithNums() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("hell32o wo33rld");
				
				//Then
				assertTrue(revertString.equals("olle32h dl33row"));				
			}
	@Test
	void testRevertFewWordsWithFewWhitespaces() {
		//Given
				Anagrams anagrams = new Anagrams();
				
				//When
				String revertString = anagrams.revertInput("hell32o   wo33rld");
				
				//Then
				assertTrue(revertString.equals("olle32h   dl33row"));				
			}
	@Test
	void testRevertForNullInput( ) {
		Anagrams anagrams = new Anagrams();
		String revertString = null;
		assertThrows(IllegalArgumentException.class, () -> anagrams.revertInput(revertString));		
	}
	}
	
	
	



