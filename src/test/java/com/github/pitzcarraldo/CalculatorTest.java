package com.github.pitzcarraldo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mockito.runners.MockitoJUnitRunner;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author Pitzcarraldo (http://pitzcarraldo.github.io/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CalculatorTest.AddTest.class,
	CalculatorTest.DevideTest.class
})
public class CalculatorTest {

	@RunWith(MockitoJUnitRunner.class)
	public static class AddTest {
		private Calculator sut;

		@Test
		public void shouldReturnNullWhenFirstParameterIsNull() {
			BDD.given(
				"첫번째 인자는 null이다.",
				"두번째 인자는 null이 아니다."
			);
			Integer firstParam = null;
			Integer secondParam = 1;

			BDD.when("인자들을 더한다.");
			Integer actual = sut.add(firstParam, secondParam);

			BDD.then("null이 리턴된다.");
			assertThat(actual).isNull();
		}

		@Test
		public void shouldReturnNullWhenSecondParameterIsNull() {
			BDD.given(
				"첫번째 인자는 null이 아니다.",
				"두번째 인자는 null이다."
			);
			Integer firstParam = 1;
			Integer secondParam = null;

			BDD.when("인자들을 더한다.");
			Integer actual = sut.add(firstParam, secondParam);

			BDD.then("null이 리턴된다.");
			assertThat(actual).isNull();
		}

		@Test
		public void shouldReturnNullWhenBothParametersAreNull() {
			BDD.given("모든 인자가 null이다.");
			Integer firstParam = null;
			Integer secondParam = null;

			BDD.when("인자들을 더한다.");
			Integer actual = sut.add(firstParam, secondParam);

			BDD.then("null이 리턴된다.");
			assertThat(actual).isNull();
		}

		@Test
		public void shouldReturnAddingResultWhenBothParametersAreNormalInteger() {
			BDD.given("모든 인자가 null이 아니다.");
			Integer firstParam = 1;
			Integer secondParam = 2;

			BDD.when("인자들을 더한다.");
			Integer actual = sut.add(firstParam, secondParam);

			BDD.then("더한 값이 리턴된다.");
			assertThat(actual).isEqualTo(3);
		}
	}

	@RunWith(MockitoJUnitRunner.class)
	public static class DevideTest {
		private Calculator sut;

		@Test
		public void shouldReturnNullWhenNumeratorIsNull() {
			BDD.given(
				"분자가 null이다.",
				"분모는 null이 아니다."
			);
			Integer numerator = null;
			Integer denominator = 1;

			BDD.when("분자를 분모로 나눈다.");
			Float actual = sut.divide(numerator, denominator);

			BDD.then("null이 리턴된다.");
			assertThat(actual).isNull();
		}

		@Test
		public void shouldReturnNullWhenDenominatorIsNull() {
			BDD.given(
				"분자는 null이 아니다.",
				"분모가 null이다."
			);
			Integer numerator = null;
			Integer denominator = 1;

			BDD.when("분자를 분모로 나눈다.");
			Float actual = sut.divide(numerator, denominator);

			BDD.then("null이 리턴된다.");
			assertThat(actual).isNull();
		}

		@Test
		public void shouldReturnNullWhenNumeratorAndDenominatorAreNull() {
			BDD.given(
				"분자는 null이다.",
				"분모도 null이다."
			);
			Integer numerator = null;
			Integer denominator = null;

			BDD.when("분자를 분모로 나눈다.");
			Float actual = sut.divide(numerator, denominator);

			BDD.then("null이 리턴된다.");
			assertThat(actual).isNull();
		}

		@Test
		public void shouldReturnNullWhenDenominatorIsZero() {
			BDD.given(
				"분자는 null이 아니다.",
				"분모가 0이다."
			);
			Integer numerator = 1;
			Integer denominator = 0;

			BDD.when("분자를 분모로 나눈다.");
			Float actual = sut.divide(numerator, denominator);

			BDD.then("null이 리턴된다.");
			assertThat(actual).isNull();
		}

		@Test
		public void shouldReturnNullWhenNumeratorAndDenominatorAreNotNull() {
			BDD.given(
				"분자는 null이 아니다.",
				"분모도 null이 아니다."
			);
			Integer numerator = 4;
			Integer denominator = 2;

			BDD.when("분자를 분모로 나눈다.");
			Float actual = sut.divide(numerator, denominator);

			BDD.then("분자를 분모로 나눈 값이 리턴된다.");
			assertThat(actual).isEqualTo(2);
		}
	}
}