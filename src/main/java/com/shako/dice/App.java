package com.shako.dice;

public class App {

	public static void main(String[] args) {

		int count = 0;
		int handredCount = 0;
		int rand;
		for (int i = 0; i < 1000; ++i) {
			rand = GeneratorUtil.generateInteger();
			if (rand < 10) {
				System.out.printf("  %d", rand);
			} else if (rand == 100) {
				++handredCount;
				continue;
			} else {
				System.out.printf(" %d", rand);
			}
			if (++count > 25) {
				System.out.println();
				count = 0;
			}
		}
		System.out.printf("\n\n%d\n\n", handredCount);
	}
}
