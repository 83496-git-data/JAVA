package com.employee.salary;

import java.util.Scanner;

import com.employee.interfaces.Acceptable;

public class BaseSalariedCommissionEmployees extends CommissionEmployees implements Acceptable {
double baseSalary;
	@Override
	public void acceptData(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptData(sc);
		System.out.print("Enter Base SAlary - ");
		baseSalary = sc.nextDouble();
	}
	
	@Override
	public void calculateTotalSalary() {
		// TODO Auto-generated method stub
earning=(commissionRate*grossSales)+baseSalary;
	}
	public void incremmentSal() {
		// TODO Auto-generated method stub
earning=(commissionRate*grossSales)+baseSalary+baseSalary*0.1;
	}

	@Override
	public String toString() {
		return "BaseSalariedCommissionEmployees : \n baseSalary =" + baseSalary + "\n commissionRate =" + commissionRate
				+ "\n grossSales =" + grossSales + "\n  firstName =" + firstName + "\n  lastName =" + lastName
				+ "\n  socialSecurityNumber =" + socialSecurityNumber + "\n earning =" + earning ;
	}
	
	
}
