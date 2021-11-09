package com.bridgeit.emplogics;

public class EmpWageComputation {

	public static final int IS_ABSCENT = 0;
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static final int FULL_TIME_WORKING_HRS = 8;
	public static final int PART_TIME_WORKING_HRS = 4;

	public static void empWageComputation(String name, int totalWorkingHrsInMonth, int workingDaysInMonth,
			int empWagePerHour) {
		int totalEmpWagePerDay = 0, totalMontlyWageOfEmp = 0, totalNoOfHrsWorked = 0, totalNoOfDaysWorked = 0;

		while (totalNoOfDaysWorked <= workingDaysInMonth && totalNoOfHrsWorked <= totalWorkingHrsInMonth) {

			double empCheck = Math.floor(Math.random() * 10) % 3;

			int empSwitchCheck = (int) empCheck;

			switch (empSwitchCheck) {
				case IS_PRESENT:
					totalNoOfHrsWorked = totalNoOfHrsWorked + FULL_TIME_WORKING_HRS;
					totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
					totalEmpWagePerDay = FULL_TIME_WORKING_HRS * empWagePerHour;
					totalMontlyWageOfEmp = totalMontlyWageOfEmp + totalEmpWagePerDay;
					break;
				case IS_PART_TIME:
					totalNoOfHrsWorked = totalNoOfHrsWorked + PART_TIME_WORKING_HRS;
					totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
					totalEmpWagePerDay = PART_TIME_WORKING_HRS * empWagePerHour;
					totalMontlyWageOfEmp = totalMontlyWageOfEmp + totalEmpWagePerDay;
					break;
				default:
					totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
			}
		}
		System.out.println("company name : " + name + " \n total employee wage " + totalMontlyWageOfEmp);
	}

	public static void main(String[] args) {
		empWageComputation("jio", 100, 20, 25);
		empWageComputation("Dmart", 80, 24, 25);
		empWageComputation("bigB", 90, 28, 30);
	}
}
