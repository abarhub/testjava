package org.testjava.testexercices;

import java.io.IOException;

/**
 * Created by Alain on 29/01/2017.
 */
public class TestRes {

	public static void main(String[] args) {
		try (MyResource1 r1 = new MyResource1();
		     MyResource2 r2 = new MyResource2();) {
			System.out.print("T ");
		} catch (IOException ioe) {
			System.out.print("IOE ");
		} finally {
			System.out.print("F ");
		}
	}
}
