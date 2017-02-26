package org.testjava.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Alain on 26/02/2017.
 */
public class TestStream1 {

	public static void main(String[] arg) {
		test1();
		test2();
		test3();
	}

	private static void test1() {
		Stream.of(1, 2, 3).map(String::valueOf).forEach(System.out::println);
	}

	private static void test2() {
		System.out.println("test2");
		final int max = 100_000;
		long debut = System.currentTimeMillis();
		IntStream.rangeClosed(2, max)
				.filter(x -> x == 2 || x % 2 != 0)
				.filter(x -> IntStream.range(2, Math.min(x, (int) Math.sqrt(max)))
						.noneMatch(y -> y != x && x % y == 0))
				.forEach(System.out::println);
		long fin = System.currentTimeMillis();
		System.out.println("premier 2.." + max + " : " + (fin - debut) + " ms");
	}

	private static void test3() {
		System.out.println("test3");
		IntStream.rangeClosed(1, 100).reduce((a, b) -> b).ifPresent(System.out::println);
		IntStream.of(1, 2, 3, 4).reduce((a, b) -> b).ifPresent(System.out::println);
		IntStream.of(1).reduce((a, b) -> b).ifPresent(System.out::println);
		IntStream.empty().reduce((a, b) -> b).orElseGet(() -> {
			System.out.println("Absent");
			return 0;
		});
	}
}
