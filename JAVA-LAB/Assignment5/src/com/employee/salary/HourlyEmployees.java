package com.employee.salary;

import java.util.Scanner;

import com.employee.interfaces.Acceptable;

public class HourlyEmployees extends Employee implements Acceptable {
	double hourlyWage;
	int hours;
	@Override
		public void acceptData(Scanner sc) {
		
			super.acceptData(sc);
			System.out.print("Enter wage per hour - ");
			hourlyWage = sc.nextDouble();
			System.out.print("Enter HOurs - ");
			hours = sc.nextInt();
		}

		@Override
		public void calculateTotalSalary() {
		
			if (hours<=40) {
				earning = hourlyWage*hours;
			} else if (hours>40) {
earning = (40*hourlyWage) +(hours-40)*hourlyWage*1.5;
			}

		}

		@Override
		public String toString() {
			return "HourlyEmployees  : \n hourlyWage=" + hourlyWage + "\n hours=" + hours + "\n firstName=" + firstName
					+ "\n lastName=" + lastName + "\n socialSecurityNumber=" + socialSecurityNumber + "\n earning="
					+ earning;
		}
		

	}
