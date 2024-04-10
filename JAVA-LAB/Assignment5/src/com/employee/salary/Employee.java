package com.employee.salary;

import java.util.Scanner;

import com.employee.interfaces.Acceptable;

public abstract class Employee implements Acceptable {

	 String firstName;
	 String lastName;
	 long socialSecurityNumber;
	 double earning;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(long socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	

	
	public double getEarning() {
		return earning;
	}
	public void setEarning(double earning) {
		this.earning = earning;
	}
	@Override
	public void acceptData(Scanner sc) {
		System.out.print("Enter First Name -  ");
		firstName = sc.next();
		System.out.print("Enter Last Name -  ");
		lastName = sc.next();
		System.out.print("Enter SSN - ");
		socialSecurityNumber = sc.nextLong();
	}
	
	@Override
	public String toString() {
		return "Employee Name=" + firstName + " " + lastName + "\n socialSecurityNumber="
				+ socialSecurityNumber + "\n earning=" + earning ;
	}
	public abstract void calculateTotalSalary();
	
	
}
