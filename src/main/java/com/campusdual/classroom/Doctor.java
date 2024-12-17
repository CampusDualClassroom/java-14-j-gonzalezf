package com.campusdual.classroom;

public class Doctor extends Person {

    protected String specialization;

    public Doctor(String name, String surname, String specialization) {
        super(name, surname);
        this.specialization = specialization;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println(", Specialization: " + specialization);
		/*
		StringBuilder sp = new StringBuilder(", Specialization: ");
		sp.append(specialization);
		System.out.println(sp);
		*/
    }
}
