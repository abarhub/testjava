package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 13/05/2017.
 */
public class Assert {

	public static final Logger LOG = LoggerFactory.getLogger(Assert.class);

	public static <T> void equals(T obj1, T obj2) {
		if (obj1 == null) {
			if (obj2 != null) {
				throw new IllegalArgumentException("les paramètres sont différents : " + obj1 + "!=" + obj2);
			}
		} else {
			if (obj2 == null || !obj1.equals(obj2)) {
				throw new IllegalArgumentException("les paramètres sont différents : " + obj1 + "!=" + obj2);
			}
		}
		LOG.info("{}=={}", obj1, obj2);
	}
}
