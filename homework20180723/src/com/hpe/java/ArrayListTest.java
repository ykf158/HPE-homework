package com.hpe.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void test1() {
		
		List<String> list = new ArrayList<>();
		list.add("laowang");
		list.add("小明");
		list.add("大头");
		list.add("xiaohong");
		showList(list);
		
		list.remove("小明");
		list.set(findIndexByValues(list, "laowang"), "老王");
		showList(list);
		System.out.println("----------");
		
		System.out.println(list.get(findIndexByValues(list, "xiaohong")));
		
		
		
	}
	
	
	@Test 
	public void test2() {
		
		List<String> list = new ArrayList<>();
		list.add("laowang");
		list.add("小明");
		list.add("大头");
		list.add("小明");
		list.add("xiaohong");
		list.add("大头");
		showList(list);
		System.out.println("-----------------");
		onlyOne(list);
		showList(list);
		
		
		
	}
	
	@Test
	public void test3() {
		
		List<String> course = new ArrayList<>();
		course.add("java");
		course.add("mysql");
		course.add("linux");
		
		for (int i = 0; i < course.size(); i++) {
			System.out.println(course.get(i)+"!");
			
		}
		
		for (String string : course) {
			System.out.println(string+"@");
		}
		
		for (Iterator<String> it = course.iterator(); it.hasNext();) {
			String string = (String) it.next();
			System.out.println(string+"#");
		}
		
		
	}
	
	
	
	//元素去重
	public void onlyOne(List<String> list) {
		
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
			
			
		}
		
	}
	
	
	//返回元素索引
	public int findIndexByValues(List<String> list , String values) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == values) {
				return i;
			}
		}
		return -1;
	}
	
	//遍历集合
	public void showList(List<String> list) {
		
		for (String string : list) {
			System.out.println(string);
			
		}
		
	}
	
}
