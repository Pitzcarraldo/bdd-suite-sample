package com.github.pitzcarraldo;

/**
 * @author Pitzcarraldo (http://pitzcarraldo.github.io/)
 */
public class Calculator {
	public static Integer add(Integer a, Integer b) {
		if (a == null) {
			return null;
		}

		if (b == null) {
			return null;
		}

		return a + b;
	}

	public static Float divide(Integer numerator, Integer denominator) {
		if (numerator == null) {
			return null;
		}

		if (denominator == null) {
			return null;
		}

		if (denominator == 0) {
			return null;
		}

		return numerator.floatValue() / denominator.floatValue();
	}
}
