package com.campusdual.classroom;

public class Teacher extends Person {

    protected String area;

    public Teacher(String name, String surname, String area) {
        super(name, surname);
        this.area = area;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println(", Area: " + area);
		/*
		StringBuilder ar = new StringBuilder(", Area: ");
		ar.append(area);
		System.out.println(ar);
		*/
    }
}
