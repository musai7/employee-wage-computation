package com.bridgeit.emplogics;

public class EmpWageComputation {

	// calculating emp wage by using switch case
	public static void main(String[] args) {
		double empCheck = Math.floor(Math.random() * 10) % 3;
		int empSwitchCheck = (int) empCheck;
		int totalEmpWagePerDay = 0;
		// constants
		int empWagePerHr = 20, is_fullTimeWorkingHrs = 8, is_partTimeWorkingHrs = 4;

		switch (empSwitchCheck) {
			case 1:
				totalEmpWagePerDay = is_fullTimeWorkingHrs * empWagePerHr;
				System.out.println("daily employee wage is : " + totalEmpWagePerDay);
				break;
			case 2:
				totalEmpWagePerDay = is_partTimeWorkingHrs * empWagePerHr;
				System.out.println("daily employee wage is : " + totalEmpWagePerDay);
				break;
			default:
				System.out.println("daily employee wage is : " + totalEmpWagePerDay);
		}
	}
}
