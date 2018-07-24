package com.hpe.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTest {

	public static void main(String[] args) {

		output();
	}

	public static void output() {

		FileOutputStream fos = null;
		String str = "七夕\r\n" + "作者：徐凝\r\n" + "一道鹊桥横渺渺，\r\n" + "千声玉佩过玲玲。\r\n" + "别离还有经年客，\r\n" + "怅望不如河鼓星。\r\n";
		try {
			fos = new FileOutputStream("test.txt");
			fos.write(str.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
