package org.testjava.functionnal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testjava.testoverloadoverride.TestOverride;

/**
 * Created by Alain on 05/02/2017.
 */
public class TestFunctionnal {

	public static final Logger LOG = LoggerFactory.getLogger(TestFunctionnal.class);

	@FunctionalInterface
	interface TestFunc1 {

		public void test1();
	}

}
