package example;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedSampleTest {

	@MethodSource("getParams")
	@ParameterizedTest
	public void addInts(int op1, int op2, int expectedResult) {
		Assertions.assertEquals(expectedResult, op1 + op2);
	}

	@SuppressWarnings("unused")
	private static Stream<Arguments> getParams() {
		return Stream.of(Arguments.of(1, 1, 2), Arguments.of(4, -3, 1), Arguments.of(1, -3, -2));
	}
}