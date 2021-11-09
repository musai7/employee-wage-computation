package com.bridgeit.emplogics;

public class EmpWageComputation {

	public static final int IS_ABSCENT = 0;
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static final int TOTAL_WORKING_HRS_IN_MONTH = 100;
	public static final int WORKING_DAYS_IN_MONTH = 20;
	public static final int EMP_WAGE_PER_HOUR = 20;

	public static void empWageComputation(String name, int totalWorkingHrsInMonth, int workingDaysInMonth,
			int empWagePerHour) {
		int totalEmpWagePerDay = 0, totalMontlyWageOfEmp = 0, totalNoOfHrsWorked = 0, totalNoOfDaysWorked = 0;

		int is_fullTimeWorkingHrs = 8, is_partTimeWorkingHrs = 4;

		while (totalNoOfDaysWorked <= WORKING_DAYS_IN_MONTH && totalNoOfHrsWorked <= TOTAL_WORKING_HRS_IN_MONTH) {

			double empCheck = Math.floor(Math.random() * 10) % 3;

			int empSwitchCheck = (int) empCheck;

			switch (empSwitchCheck) {
				case IS_PRESENT:
					totalNoOfHrsWorked = totalNoOfHrsWorked + is_fullTimeWorkingHrs;
					totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
					totalEmpWagePerDay = is_fullTimeWorkingHrs * EMP_WAGE_PER_HOUR;
					totalMontlyWageOfEmp = totalMontlyWageOfEmp + totalEmpWagePerDay;
					break;
				case IS_PART_TIME:
					totalNoOfHrsWorked = totalNoOfHrsWorked + is_fullTimeWorkingHrs;
					totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
					totalEmpWagePerDay = is_partTimeWorkingHrs * EMP_WAGE_PER_HOUR;
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
