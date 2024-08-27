package hu.ibello.training.abstraction;

@FunctionalInterface
public interface TextCalculationStrategy {

	public int calculate(String text);
}
