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
			else  {
				char tmp = wordAsChars[l];
				wordAsChars[l] = wordAsChars[r];
				wordAsChars[r] = tmp;
                l++;
                r--;
			}
		}
			StringBuilder sb = new StringBuilder();
			for (char c: wordAsChars) {
				sb.append(c);
			}
		return sb.toString();
	}

	public String[] splitInputByWord(String input) {
		String[] splittedInput = input.trim().split(" ");
		return splittedInput;
	}

	public String revertInput(String Input) {
		StringBuilder sb = new StringBuilder();
		String[] getInputSplitted = splitInputByWord(Input);
		for (String s : getInputSplitted) {
			s = revertOneWord(s);
			sb.append(s);
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrams test = new Anagrams();
		String input0 = "hello wi!ll it work";
		String input1 = "hello i am testing this! string";
		String input2 = "hone last test!";
		System.out.println(input0);
		System.out.println(test.revertInput(input0));
		System.out.println();
		System.out.println(input1);
		System.out.println(test.revertInput(input1));
		System.out.println();
		System.out.println(input2);
		System.out.println(test.revertInput(input2));

	}

}
