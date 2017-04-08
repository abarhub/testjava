package org.testjava.programmer2.testexercices;

import java.io.IOException;

/**
 * Created by Alain on 29/01/2017.
 */
public class MyResource1 implements AutoCloseable {
	public void close() throws IOException {
		System.out.print("1 ");
	}
}
