package com.campusdual.classroom;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void getDetails() {
        System.out.print("Name: " + name + ", Surname: " + surname);
        /*
		StringBuilder details = new StringBuilder("Name: ");
		details.append(name);
		details.append(", Surname: ");
		details.append(surname);
		System.out.print(details);
		*/
    }
}
