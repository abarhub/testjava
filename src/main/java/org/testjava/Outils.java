package org.testjava;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 05/02/2017.
 */
public final class Outils {

	public static final Logger LOG = LoggerFactory.getLogger(Outils.class);

	private Outils() {

	}

	public static final void test(Logger logger, String message, Object val1, Object val2) {
		if (val1 == null) {
			if (val2 == null) {
				logger.info(message + " OK");
			} else {
				Preconditions.checkArgument(val2 == null, message + " (param1=null,param2=" + val2 + ")");
			}
		} else {
			if (val2 != null && val1.equals(val2)) {
				logger.info(message + " OK");
			} else {
				Preconditions.checkArgument(val2 != null && val1.equals(val2), message + " (param1=" + val1 + ",param2=" + val2 + ")");
			}
		}
	}
}
