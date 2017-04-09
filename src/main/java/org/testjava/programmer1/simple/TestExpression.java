package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 09/04/2017.
 */
public class TestExpression {

	public static final Logger LOG = LoggerFactory.getLogger(TestExpression.class);

	public static void main(String args[]) {
		test1();
	}

	public static void test1() {
		System.out.println(5 + 8 + "aaa" + 1 + 2); // donne : 13aaa12
	}

}
