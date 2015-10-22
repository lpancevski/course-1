package com.example.course.hello;


public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hellow World");
		
		Person person = new Person("Petre", "Petkovski");
		person.setAge(20);
		person.setMydog(new Dog("SHARKO"));
		
		System.out.println(person.getMydog().getName());
		
		Employee employee = new Employee("Dejan", "Stolevski", "Android", 25000);
		System.out.println(employee.getDepartment());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
		
		System.out.println(employee.getAge());
	}

}
