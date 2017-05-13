package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 13/05/2017.
 */
public class TestString {

	public static final Logger LOG = LoggerFactory.getLogger(TestString.class);

	public static void main(String args[]) {
		test1();
		//test2();
	}

	private static void test1() {

		replaceStr("abcdef", "a", "");

		replaceStr("abcdef", "a", null);
		replaceStr("abcdef", null, "b");
	}

	private static void replaceStr(String s, String s1, String s2) {
		LOG.info("repace({},{} => {}):", s, s1, s2);
		try {
			String res = s.replace(s1, s2);
			LOG.info("res=" + res);
		} catch (Exception e) {
			LOG.error("err:" + e, e);
		}
	}
}
