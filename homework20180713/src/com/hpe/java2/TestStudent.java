package com.hpe.java2;

public class TestStudent {

	public static void main(String[] args) {

		Student[] s = new Student[5]; 
		s[0] = new Student(1, "小明", "男", 20, 99);
		s[1] = new Student(2, "小红", "女", 21, 96);
		s[2] = new Student(3, "小黑", "男", 20, 92);
		s[3] = new Student(4, "小白", "女", 21, 93);
		s[4] = new Student(5, "小黄", "男", 20, 100);
		
		for (Student student : s) {
			System.out.println(student);
		}
		double sum = 0;
		for (Student student : s) {
			sum+=student.getsJava();
		}
		System.out.println("平均值"+sum/s.length);
		
		double max = s[0].getsJava();
		double min = s[0].getsJava();
		
		for (Student student : s) {
			if (student.getsJava()>max) {
				max = student.getsJava();
			}
			if (student.getsJava()<min) {
				min = student.getsJava();
			}
		}
		System.out.println("最高分"+max);
		System.out.println("最低分"+min);
	}

}
