package Solve2;

public class Customer {
	private String name;
	private int age;
	private String cell;
	private String email;
	protected String customerID;

	public Customer(String name, int age, String cell, String email, String customerID) {
		this.name = name;
		this.age = age;
		this.cell = cell;
		this.email = email;
		this.customerID = customerID;
	}

	public void display() {
		System.out.println("Customer Detail:");
		System.out.println("----------------------");
		System.out.println("Name: " + name + "\t" + "Age: " + age);
		System.out.println("Cell: " + cell + "\t" + "Email: " + email);
		System.out.println("Customer ID: " + customerID);
	}

}

