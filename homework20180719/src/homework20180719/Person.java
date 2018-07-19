package homework20180719;

public class Person {

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person other = (Person)obj;
		if(this.name == other.name&&this.age == other.age) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
