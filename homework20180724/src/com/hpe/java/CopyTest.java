package com.hpe.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {

	public static void main(String[] args) {

		copy();
	}

	public static void copy() {

		//声明输入输出流的对象
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			//读取数据并转换成字符串
			//初始化输入流对象
			fis = new FileInputStream("test.txt");
			byte[] b = new byte[128];//定义byte数组保存读取的字节数据
			int len;//保存读取字节的长度
			String str = "";
			while ((len = fis.read(b)) != -1) {
				//将byte数组中的字节数据转换成字符串
				String string = new String(b, 0, len);
				//拼接每次读取的字符串
				str += string;
			}
			
			//写入到新的文件中
			//初始化输出流对象
			fos = new FileOutputStream("test1.txt");
			//将字符串写入到文件中
			fos.write(str.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//关闭输入输出流
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		

	}

}
