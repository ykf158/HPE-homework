package com.hpe.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputTest {

	public static void main(String[] args) {

		input();
		
	}
	
	public static void input() {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("test.txt");
			byte[] b = new byte[128];
			int len;
			while ((len = fis.read(b))!=-1) {
				String str = new String(b, 0, len);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fis == null) {
				System.out.println("找不到文件");
			}else {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
