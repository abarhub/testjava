package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 08/04/2017.
 */
public class TestOverloading {

	public static final Logger LOG = LoggerFactory.getLogger(TestOverloading.class);

	public static void main(String args[]) {
		test1("Abc", "cdef");
		test1("Abc");
		test1("Abc", "cdef", "ghi");
	}

	public static void test1(String s1, String s2) {
		LOG.info("test1(String,String)");
	}

	public static void test1(int i) {
		LOG.info("test1(int)");
	}

	public static void test1(String... s1) {
		LOG.info("test1(String...)");
	}
}
