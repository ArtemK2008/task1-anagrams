package com.foxminded.artem.task1;

public class Anagrams {

	private String reverseSingleWordLettersOnly(String word) {
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

	private String[] splitEveryWordBySpace(String input) {
		String[] splittedInput = input.trim().split(" ");
		return splittedInput;
	}

	public String reverseLettersOnlyInWholeString(String Input) {
		if (Input == null) {
			throw new IllegalArgumentException("wrong input");
		} else {
			StringBuilder sb = new StringBuilder();
			String[] getInputSplitted = splitEveryWordBySpace(Input);
			for (String s : getInputSplitted) {
				s = reverseSingleWordLettersOnly(s);
				sb.append(s);
				sb.append(" ");
			}
			return sb.toString().trim();
		}
	}
}
