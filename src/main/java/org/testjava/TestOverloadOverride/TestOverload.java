package org.testjava.TestOverloadOverride;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 05/02/2017.
 */
public class TestOverload {

	public static final Logger LOG = LoggerFactory.getLogger(TestOverload.class);

	public static void test() {
		LOG.info("* TestOverload.test :");
		Overload2 overload2 = new Overload2();
		overload2.methode1(5);
		overload2.methode1('A');
	}

	static class Overload {
		public void methode1(int i) {
			LOG.info("Overload.methode1 : {}",i);
		}
	}

	static class Overload2 extends Overload {

		// redéfinition de la methode de la classe ancetre
		@Override
		public void methode1(int i) {
			LOG.info("Overload2.methode1 : {}",i);
		}

		// override ne peut pas être utiliser ici, car les paramètres sont différents
		//@Override
		public void methode1(char c){
			LOG.info("Overload2.methode1(char) : {}",c);
		}
	}
}
