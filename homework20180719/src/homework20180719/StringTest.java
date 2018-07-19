package homework20180719;

import org.junit.Test;

public class StringTest {

	@Test
	public void test1() {
		String[] strs = {"nba","abc","cba","zz","qq","haha"};
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < strs.length-1-i; j++) {
				if (strs[j].compareTo(strs[j+1])>0) {
					String temp = strs[j];
					strs[j] = strs[j+1];
					strs[j+1] = temp;
				}
			}			
			
		}
		
		for (String str : strs) {
			System.out.println(str);
			
		}
	}

	
	
	@Test
	public void test2() {
		String str = "nbaernbatynbauinbaopnba";
		String s1 = str.replaceAll("nba", "*");
		int count = 0;
		char[] c = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			c[i] = s1.charAt(i);
		}
		for (char d : c) {
			if(d == '*') {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

	@Test
	public void test3() {
		
		String str = new String("hello");
		String str1 = "hello";
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		
	}
	
	@Test
	public void test4() {
		Person p1 = new Person("xiaowang",12);
		Person p2 = new Person("xiaowang",12);
		System.out.println(p1.equals(p2));
	}
	
	@Test
	public void test5() {
		
		String str = "Hello World";
		int firstIndex = str.indexOf('o');
		System.out.println(firstIndex);
		int lastIndex = str.lastIndexOf('o');
		System.out.println(lastIndex);
		String s = str.replaceAll("l","m");
		System.out.println(s);
		String[] split = str.split(" ");
		for (String str1 : split) {
			System.out.println(str1);
		}
		
		System.out.println(split[0].compareTo(split[1]));
		
	}

}
