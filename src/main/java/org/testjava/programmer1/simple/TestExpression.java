package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 09/04/2017.
 */
public class TestExpression {

	public static final Logger LOG = LoggerFactory.getLogger(TestExpression.class);

	public static void main(String args[]) {
		test1();
		test2();
	}

	public static void test1() {
		System.out.println(5 + 8 + "aaa" + 1 + 2); // donne : 13aaa12
	}

	public static void test2() {
		int i = 1234_56789;
		//int i2=123456789_; ne compile pas car _ ne doit pas être à la fin
		//int i3=_123456789; ne compile pas car _ ne doit pas être au début
		int i4 = 0x123_456;
		//int i5=0_x123456; ne compile pas car _ ne doit pas être entre le 0 et le x
		//int i6=0x_123456; ne compile pas car _ ne doit pas être juste apres le x
		//int i7=0x123456_; ne compile pas car _ ne doit pas être à la fin
		int i8 = 0b1010_010;
		//int i9=0_b1010010; ne compile pas car _ ne doit pas être entre le 0 et le b
		//int i10=0b_1010010; ne compile pas car _ ne doit pas être juste apres le b
		//int i11=0b1010010_; ne compile pas car _ ne doit pas être à la fin
		int i12 = 0123_45;
		int i13 = 0_12345;

		System.out.println(i + " " + i4 + " " + i8 + " " + i12 + " " + i13);
	}

}
