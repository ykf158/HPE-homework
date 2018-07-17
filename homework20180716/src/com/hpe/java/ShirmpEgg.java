package com.hpe.java;

import org.junit.Test;

public class ShirmpEgg {

	@Test
	public void egg() {
		for (int i = 10; i <= 98; i += 2) {
			for (int j = 21; j <= 89; j += 2) {
				if (i / 10 % 2 != 0 && j / 10 % 2 == 0) {
					int a = i * (j % 10);
					int b = i * (j / 10);
					int c = a + b * 10;
					if (isEven(a) && isEven(b) && isEven(c)) {
						System.out.println(i + "*" + j);
					}

				}
			}

		}
	}

	public boolean isEven(int num) {

		if (num < 100) {
			if (num / 10 % 2 == 0 && num % 2 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			if (num / 100 % 2 == 0 && num / 10 % 10 % 2 == 0 && num % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
}
