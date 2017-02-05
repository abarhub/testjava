package org.testjava.testoverloadoverride;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testjava.Outils;

import java.awt.*;

/**
 * Created by Alain on 05/02/2017.
 */
public class TestOverride {

	public static final Logger LOG = LoggerFactory.getLogger(TestOverride.class);

	public static void test() {
		LOG.info("* TestOverride.test :");
		Override2 overload2 = new Override2();
		overload2.methode1(5);
		overload2.methode1('A');
		overload2.methode1(7, 8);
		LOG.info("methode2 : " + overload2.methode2());
		Outils.test(LOG, "methode2 : ", 7, overload2.methode2());
		overload2.methode3(Color.BLACK); // methode de la classe Override
		overload2.methode3(4); // methode de la classe Override2
	}

	static class Override {
		public void methode1(int i) {
			LOG.info("Override.methode1 : {}", i);
		}

		public Object methode2() {
			LOG.info("Override.methode2");
			return this;
		}

		public void methode3(Object o){
			LOG.info("Override.methode3");
		}
	}

	static class Override2 extends Override {

		// redéfinition de la methode de la classe ancetre
		// c'est un override
		@java.lang.Override
		public void methode1(int i) {
			LOG.info("Override2.methode1 : {}", i);
		}

		// override ne peut pas être utiliser ici, car les paramètres sont différents
		// c'est un overload
		//@Override
		public void methode1(char c) {
			LOG.info("Override2.methode1(char) : {}", c);
		}

		// c'ets un overload
		//@Override
		public void methode1(int i, int j) {
			LOG.info("Override2.methode1(int,int) : {},{}", i, j);
		}

		// le type de retour est un sous type, donc c'est un override
		@java.lang.Override
		public Integer methode2() {
			LOG.info("Override2.methode2");
			return new Integer(7);
		}

		//@Override
		public void methode3(Integer o){
			LOG.info("Override2.methode3");
		}
	}
}
