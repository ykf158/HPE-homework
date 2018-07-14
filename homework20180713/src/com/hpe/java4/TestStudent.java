package com.hpe.java4;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student("小红", 22, "女", 0001);
		Student s2 = new Student("小黄", 24, "男", 0002);
		Student s3 = new Student("小蓝", 22, "女", 0003);
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
	}

}
