package org.testjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testjava.programmer2.functionnal.TestFunctionnal;
import org.testjava.programmer2.testoverloadoverride.TestOverride;
import org.testjava.programmer2.testexercices.TestRes;

/**
 * Hello world!
 */
public class App {
	public static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOG.info("Debut");

		TestRes.test();
		TestOverride.test();
		TestFunctionnal.test();

		LOG.info("Fin");
	}
}
