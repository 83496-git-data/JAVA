package com.employee.salary;

import java.util.Scanner;

import com.employee.interfaces.Acceptable;

public class SalariedEmployees extends Employee implements Acceptable {
double weeklySalary;
@Override
	public void acceptData(Scanner sc) {
	
		super.acceptData(sc);
		System.out.print("Enter Weekly Salary - ");
		weeklySalary = sc.nextDouble();
	}

	@Override
	public void calculateTotalSalary() {
	earning =weeklySalary;
		System.out.println(" Weekly Salary - "+weeklySalary);

	}

	@Override
	public String toString() {
		return "SalariedEmployees  : \n weeklySalary=" + weeklySalary + "\n firstName=" + firstName + "\n lastName=" + lastName
				+ "\n socialSecurityNumber=" + socialSecurityNumber + "\n earning=" + earning ;
	}

}
