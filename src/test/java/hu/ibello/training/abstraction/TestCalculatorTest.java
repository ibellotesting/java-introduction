package hu.ibello.training.abstraction;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TestCalculatorTest {

    @Test
    public void calculate_should_throw_exception_if_text_is_null() {
        TextCalculator calculator = calculator(null);
        assertThatThrownBy(() -> calculator.calculate(TextCalculationKind.RETURN_LENGTH))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    public void calculate_should_return_length_of_text() {
        TextCalculator calculator = calculator();
        int count = calculator.calculate(TextCalculationKind.RETURN_LENGTH);
        assertThat(count).isEqualTo(384);
    }

    @Test
    public void calculate_should_return_length_of_text_if_text_is_empty() {
        TextCalculator calculator = calculator("");
        int count = calculator.calculate(TextCalculationKind.RETURN_LENGTH);
        assertThat(count).isEqualTo(0);
    }

    @Test
    public void calculate_should_return_character_count_of_text() {
        TextCalculator calculator = calculator();
        int count = calculator.calculate(TextCalculationKind.COUNT_CHARS);
        assertThat(count).isEqualTo(330);
    }

    @Test
    public void calculate_should_return_character_count_of_text_if_text_is_empty() {
        TextCalculator calculator = calculator("");
        int count = calculator.calculate(TextCalculationKind.COUNT_CHARS);
        assertThat(count).isEqualTo(0);
    }

    @Test
    public void calculate_should_return_substring_count_of_text() {
        TextCalculator calculator = calculator();
        int count = calculator.calculate(TextCalculationKind.COUNT_SUBSTRING);
        assertThat(count).isEqualTo(3);
    }

    @Test
    public void calculate_should_return_substring_count_of_text_if_text_is_empty() {
        TextCalculator calculator = calculator("");
        int count = calculator.calculate(TextCalculationKind.COUNT_SUBSTRING);
        assertThat(count).isEqualTo(0);
    }

    private TextCalculator calculator(String text) {
        return new TextCalculator(text);
    }

    private TextCalculator calculator() {
        String text = "A java egy programozási nyelv és szoftverplatform," +
                " amelyet először 1995-ben adott ki a Sun Microsystems," +
                " amelyet később az Oracle Corporation vásárolt meg." +
                " A java-t úgy tervezték, hogy független legyen a platformtól," +
                " ami azt jelenti, hogy egy java programot egyszer megírva" +
                " több különböző rendszeren is futtathatunk (Windows, Mac, Linux stb.)" +
                " anélkül, hogy módosítani kellene a kódot.";

        return calculator(text);
    }
}
