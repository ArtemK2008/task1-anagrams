package com.foxminded.artem.task1;

public class Anagrams {

	public String revertOneWord(String word) {
		char[] wordAsChars = word.toCharArray();
		int r = wordAsChars.length - 1, l = 0;
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

	public String[] splitInputByWord(String input) {
		String[] splittedInput = input.trim().split(" ");
		return splittedInput;
	}

	public String revertInput(String Input) {
		if (Input == null) {
			throw new IllegalArgumentException("wrong input");
		} else {
			StringBuilder sb = new StringBuilder();
			String[] getInputSplitted = splitInputByWord(Input);
			for (String s : getInputSplitted) {
				s = revertOneWord(s);
				sb.append(s);
				sb.append(" ");
			}
			return sb.toString().trim();
		}
	}
}
