package com.shako.dice;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

import static java.lang.Math.random;

public class GeneratorUtil {

	private final Logger logger = Logger.getLogger(getClass().getSimpleName());

	private GeneratorUtil() {}
	public static int generateInteger() {
//		logger.info("Генерация целочисленного числа");
		return (int)(random() * 10) + 1;
	}

	private Logger getLogger() {
		return logger;
	}
}
