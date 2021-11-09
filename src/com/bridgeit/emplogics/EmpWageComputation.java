package com.bridgeit.emplogics;

public class EmpWageComputation {

	// added part time employee logic
	public static void main(String[] args) {
		double empCheck = Math.floor(Math.random() * 10) % 3;
		int totalEmpWagePerDay = 0;
		// constants
		int is_present = 1, is_partTime = 2, empWagePerHr = 20, is_fullTimeWorkingHrs = 8, is_partTimeWorkingHrs = 4;
		if (empCheck == is_present) {
			totalEmpWagePerDay = is_fullTimeWorkingHrs * empWagePerHr;
			System.out.println("daily employee wage is : " + totalEmpWagePerDay);
		} else if (empCheck == is_partTime) {
			totalEmpWagePerDay = is_partTimeWorkingHrs * empWagePerHr;
			System.out.println("part time employee wage is : " + totalEmpWagePerDay);
		} else
			System.out.println(" employee absent daily employee wage is : " + totalEmpWagePerDay);
	}
}
