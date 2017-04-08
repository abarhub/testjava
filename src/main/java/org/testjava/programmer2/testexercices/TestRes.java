package org.testjava.programmer2.testexercices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by Alain on 29/01/2017.
 */
public class TestRes {

	public static final Logger LOG = LoggerFactory.getLogger(TestRes.class);

	public static void test() {
		LOG.info("* TestRes.test :");
		try (MyResource1 r1 = new MyResource1();
		     MyResource2 r2 = new MyResource2();) {
			System.out.print("T ");
		} catch (IOException ioe) {
			System.out.print("IOE ");
		} finally {
			System.out.print("F ");
		}
		System.out.println();
	}
}
