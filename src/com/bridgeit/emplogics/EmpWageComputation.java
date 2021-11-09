package com.bridgeit.emplogics;

public class EmpWageComputation {

	/* Calculate Wages till a condition of total working hours or days is reached
	 for a month */

	public static void main(String[] args) {
		int totalEmpWagePerDay = 0, totalMontlyWageOfEmp = 0, totalNoOfHrsWorked = 0, totalNoOfDaysWorked = 0;

		int empWagePerHr = 20, is_fullTimeWorkingHrs = 8, is_partTimeWorkingHrs = 4;
		int totalWorkingHrsInAMonth = 100, workingDaysInAMonth = 20;

		while (totalNoOfDaysWorked < workingDaysInAMonth && totalNoOfHrsWorked < totalWorkingHrsInAMonth) {

			double empCheck = Math.floor(Math.random() * 10) % 3;

			int empSwitchCheck = (int) empCheck;

			switch (empSwitchCheck) {
			case 1:
				totalNoOfHrsWorked = totalNoOfHrsWorked + is_fullTimeWorkingHrs;
				totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
				totalEmpWagePerDay = is_fullTimeWorkingHrs * empWagePerHr;
				totalMontlyWageOfEmp = totalMontlyWageOfEmp + totalEmpWagePerDay;
				break;
			case 2:
				totalNoOfHrsWorked = totalNoOfHrsWorked + is_fullTimeWorkingHrs;
				totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
				totalEmpWagePerDay = is_partTimeWorkingHrs * empWagePerHr;
				totalMontlyWageOfEmp = totalMontlyWageOfEmp + totalEmpWagePerDay;
				break;
			default:
				totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
			}
		}
		System.out.println("total montly wage of an emp is : " + totalMontlyWageOfEmp);
	}
}
