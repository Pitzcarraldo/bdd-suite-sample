package com.github.pitzcarraldo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pitzcarraldo (http://pitzcarraldo.github.io/)
 */
public class BDD {
	private static final Logger logger = LoggerFactory.getLogger(BDD.class);

	public static void given(String... specs) {
		print(Thread.currentThread().getStackTrace()[2].getMethodName());
		print("---Given---");
		print(specs);
	}

	public static void when(String... specs) {
		print("---When---");
		print(specs);
	}

	public static void then(String... specs) {
		print("---Then---");
		print(specs);
	}

	private static void print(String... messages) {
		for(String message : messages) {
			logger.info(message);
		}
	}
}