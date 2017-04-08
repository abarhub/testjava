package org.testjava.programmer2.testexercices;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Alain on 29/01/2017.
 */
public class MyResource2 implements Closeable {
	public void close() throws IOException {
		throw new IOException();
	}
}
