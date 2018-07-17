package com.hpe.java3;

public abstract class Role {

	private String name;
	private int age;
	private char sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Role(String name, int age, char sex) {
		this();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Role() {
	}
	
	//抽象方法
	public abstract void play();
	
	public void say() {
		System.out.println("Role说话了");
	}
	
	public final void sing() {
		System.out.println("Role sing a song");
	}

	@Override
	public String toString() {
		return "Role [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
	
	

}
