package com.artem.anagrams;


public class Anagrams {

	public String reverceLettersOnlyEachWord(String input) {
		if (input == null) {
			throw new IllegalArgumentException("wrong input");
		} else {
			StringBuilder sb = new StringBuilder();
			String[] getInputSplitted = splitEveryWordBySpace(input);
			for (String s : getInputSplitted) {
				s = reverseLettersOnlyOneWord(s);
				sb.append(s);
				sb.append(" ");
			}
			return sb.toString().trim();
		}
	}

	private String reverseLettersOnlyOneWord(String word) {
		char[] wordAsChars = word.toCharArray();
		int r = wordAsChars.length - 1;
		int l = 0;
		while (l < r) {
			if (!Character.isAlphabetic(wordAsChars[l]))
				l++;
			else if (!Character.isAlphabetic(wordAsChars[r]))
				r--;
			else {
				char tmp = wordAsChars[l];
				wordAsChars[l] = wordAsChars[r];
				wordAsChars[r] = tmp;
				l++;
				r--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char c : wordAsChars) {
			sb.append(c);
		}
		return sb.toString();
	}

	private String[] splitEveryWordBySpace(String input) {
		return input.trim().split(" ");
	}
}
