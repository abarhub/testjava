package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 08/04/2017.
 */
public class TestOpShort {

	public static final Logger LOG = LoggerFactory.getLogger(TestOpShort.class);

	public static void main(String args[]) {
		test1();
		test2();
	}

	private static void test1() {
		short s1 = 5, s2 = 6;
		short s3 = (short) (s1 + s2);

		s1 = s2 = s3 = 8;

		int i = s1 + s2;

		byte b1 = 8, b2 = 9;
		byte b3 = (byte) (b1 + b2);

		final byte b4 = 8, b5 = 9;
		byte b6 = b4 + b5;

		long l1 = 5, l2 = 8;
		long l3 = l1 + l2;
		int i2 = (int) (l1 + l2);
	}

	private static void test2() {
		LOG.info("test2()");
		int i1 = 3, i2 = 4;
		int i = i1++ + i2++;
		LOG.info("i={},i1={},i2={}", i, i1, i2);

		i1 = 10;
		i = i1++ + i1++;
		LOG.info("i={},i1={},i2={}", i, i1, i2);
	}
}
