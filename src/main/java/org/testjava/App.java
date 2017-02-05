package org.testjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testjava.TestOverloadOverride.TestOverride;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        LOG.info("Debut");

        TestOverride.test();

        LOG.info("Fin");
    }
}
