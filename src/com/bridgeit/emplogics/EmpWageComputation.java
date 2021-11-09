package com.bridgeit.emplogics;

public class EmpWageComputation {

	public static final int IS_ABSCENT = 0;
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static final int totalWorkingHrsInAMonth = 100;
	public static final int workingDaysInAMonth = 20;

	public static int empWageComputation() {
		int totalEmpWagePerDay = 0, totalMontlyWageOfEmp = 0, totalNoOfHrsWorked = 0, totalNoOfDaysWorked = 0;

		int empWagePerHr = 20, is_fullTimeWorkingHrs = 8, is_partTimeWorkingHrs = 4;

		while (totalNoOfDaysWorked <= workingDaysInAMonth && totalNoOfHrsWorked <= totalWorkingHrsInAMonth) {

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
		return totalMontlyWageOfEmp;
	}

	public static void main(String[] args) {
		int totalMontlyWageOfEmp = empWageComputation();
		System.out.println("total montly wage of an emp is : " + totalMontlyWageOfEmp);
	}
}
