package hu.ibello.training.abstraction;

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
			// TODO nem whitespace karakterek összeszámolása
			return 0;
		case COUNT_SUBSTRING:
			// TODO a "java" karaktersorozat előfordulásának összeszámolása
			return 0;
		}
		return 0;
	}
	
}
