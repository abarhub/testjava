package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testjava.programmer1.simple.heritage.C2;
import org.testjava.programmer1.simple.heritage.C3;
import org.testjava.programmer1.simple.heritage.Int1;
import org.testjava.programmer1.simple.heritage.Int2;

import java.util.function.Predicate;

/**
 * Created by Alain on 14/05/2017.
 */
public class TestDivers {


	public static final Logger LOG = LoggerFactory.getLogger(TestDivers.class);

	public static void main(String args[]) {
		test1();
		test2();
	}

	private static void test1() {
		LOG.info("test1()");
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

	private static void test2() {
		LOG.info("test2()");
		C2 c2 = new C2();

		LOG.info("c2={}", c2.methode1());

		C3 c3 = new C3();
		//c3.methode1();
		Int1.methode1();
		Int2.methode1();
		LOG.info("Int1.methode1()={},Int2.methode1()={}", Int1.methode1(), Int2.methode1());
	}


}
