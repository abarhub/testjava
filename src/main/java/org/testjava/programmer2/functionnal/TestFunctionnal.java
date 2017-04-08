package org.testjava.programmer2.functionnal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 05/02/2017.
 */
public class TestFunctionnal {

	public static final Logger LOG = LoggerFactory.getLogger(TestFunctionnal.class);

	public static void test() {
		LOG.info("* TestRes.test :");
		TestFunc1 tmp = () -> LOG.info("Coucou");
		tmp.test1();
		TestFunc2 tmp2 = () -> LOG.info("Coucou2");
		tmp2.test1();
		tmp2.test2();
	}

	// l'annotation est optionnel
	@FunctionalInterface
	interface TestFunc1 {

		public void test1();
	}

	@FunctionalInterface
	interface TestFunc2 {

		public void test1();

		// une interface fonctionnelle peut avoir des methodes par défaut
		default public void test2() {
			LOG.info("TestFunc2.test2");
		}

		// une interface fonctionnelle peut déclarer les methodes abstraites qui vienne d'object,
		// mais il faut aussi une autre methode abstraite
		@Override
		public boolean equals(Object o);
	}

}
