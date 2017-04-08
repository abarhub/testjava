package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 08/04/2017.
 */
public class TestBoucles {

	public static final Logger LOG = LoggerFactory.getLogger(TestOpShort.class);

	public static void main(String args[]) {
		test1();
		test2();
	}

	private static void test1() {
		LOG.info("test1()");

		LOG.info("for 1");
		for (int i = 0; i < 10; i++) {
			LOG.info("i={}", i);
		}

		LOG.info("for 2");
		for (int i = 0; i < 10; i++) {
			LOG.info("i={}", i);
			if (i == 3) {
				break;
			}
		}

		LOG.info("for 3");
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			LOG.info("i={}", i);
		}


		LOG.info("for 4");
		label1:
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 3; j++) {
				LOG.info("i={},j={}", i, j);
				if (i == 3) {
					break label1;
				}
			}
		}

		LOG.info("for 5");
		label1:
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 3; j++) {
				LOG.info("i={},j={}", i, j);
				if (i == 3) {
					continue label1;
				}
			}
		}
	}


	private static void test2() {
		LOG.info("test2()");

		LOG.info("if 1");
		if (test(false) && test(true)) {
			LOG.info("res=true");
		} else {
			LOG.info("res=false");
		}

		LOG.info("if 2");
		if (test(false) & test(true)) {
			LOG.info("res=true");
		} else {
			LOG.info("res=false");
		}

		LOG.info("if 3");
		if (test(true) || test(false)) {
			LOG.info("res=true");
		} else {
			LOG.info("res=false");
		}

		LOG.info("if 3");
		if (test(true) | test(false)) {
			LOG.info("res=true");
		} else {
			LOG.info("res=false");
		}
	}

	private static boolean test(boolean b) {
		LOG.info("test:{}", b);
		return b;
	}

}
