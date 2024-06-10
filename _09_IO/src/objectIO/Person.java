package objectIO;

import java.io.Serializable;

public class Person implements Serializable {
	String name, gender;
	int age;
	
	Person(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
}
