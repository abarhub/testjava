package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 09/04/2017.
 */
public class TestSwitch {

	public static final Logger LOG = LoggerFactory.getLogger(TestSwitch.class);

	public static void main(String args[]) {
		test1();
		test2();
	}

	public static void test1() {


//		long n = 5;
//		switch (n) { // ne compile pas car switch ne marche qu'avec int, short, byte, char, String,enum
//			case 1:
//				System.out.println("test");
//		}

		int n2 = 6;
		switch (n2) {
			case 6:
				System.out.println("test" + n2);
		}

		short n3 = 7;
		switch (n3) {
			case 7:
				System.out.println("test" + n3);
		}

		byte n4 = 8;
		switch (n4) {
			case 8:
				System.out.println("test" + n4);
		}

		char n5 = 'a';
		switch (n5) {
			case 'a':
				System.out.println("test" + n4);
		}

		String n6 = "abc";
		switch (n6) {
			case "abc":
				System.out.println("test" + n6);
		}
	}

	public static void test2() {

		int n=5;
		int cst1=5;
		final int cst2=5;
		final int cst3;
		cst3=6;
		switch(n) {
			//case cst1: ne compile pas car cst1 n'est pas final
			case cst2:
			//case cst3: ne compile pas car la valeur de cst3 ne peut pas être calculé à la compilation
				System.out.println("test" + n);
		}
	}
}
