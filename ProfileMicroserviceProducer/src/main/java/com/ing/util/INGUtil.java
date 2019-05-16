package com.ing.util;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class INGUtil {
	public static Date getRandomDate() {
		Date startDate = new Date();
		Date endDate = new Date(2018, 6, 1);

		long random = ThreadLocalRandom.current().nextLong(startDate.getTime(), endDate.getTime());
		Date date = new Date(random);

		return date;
	}

	public static double getRandomDoubleBetweenRange(double min, double max) {
		double x = (Math.random() * ((max - min) + 1)) + min;
		return x;
	}

	public static String getRandomType() {
		String[] arr = { "Grocery", "Shopping", "Investment", "Household", "Travelling" };
		Random r = new Random();
		int randomNumber = r.nextInt(arr.length);
		return arr[randomNumber];
	}
}
