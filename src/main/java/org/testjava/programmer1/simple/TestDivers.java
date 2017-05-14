package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Predicate;

/**
 * Created by Alain on 14/05/2017.
 */
public class TestDivers {


	public static final Logger LOG = LoggerFactory.getLogger(TestDivers.class);

	public static void main(String args[]) {
		test1();
	}

	private static void test1() {
		int tab[] = {4, 7, 8, 9};
		// ne compile pas
		//int tab2[4] = {4,7,8,9};

		Predicate<Integer> f = x -> x > 5;
		Predicate<Integer> f2 = (x) -> x > 5;
		// ne compile pas
		//Predicate<Integer> f3= Integer x -> x>5;
		Predicate<Integer> f3 = (Integer x) -> x > 5;

		switch (5) {
			case 7:
			case 9:
			default:
			case 20:
			case 55:
		}

		int i = 5 > 8 ? 3 : 8;
	}

}
