package hu.ibello.training.abstraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCalculator {

	private final String text;
	
	public TextCalculator(String text) {
		this.text = text;
	}
	
	public int calculate(TextCalculationKind kind) {
		switch (kind) {
		case RETURN_LENGTH:
			return text.length();
		case COUNT_CHARS:
			int charCount = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) != ' ') {
					charCount++;
				}
			}
			return charCount;
		case COUNT_SUBSTRING:
			Pattern pattern = Pattern.compile("java");
			Matcher matcher = pattern.matcher(text);
			int count = 0;
			while (matcher.find()) {
				count++;
			}
			return count;
		}
		return 0;
	}
	
}
