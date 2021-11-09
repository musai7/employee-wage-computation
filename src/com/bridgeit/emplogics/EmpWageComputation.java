package com.bridgeit.emplogics;

public class EmpWageComputation {

	public static void main(String[] args) {
		int totalEmpWagePerDay = 0, totalMontlyWageOfEmp = 0;
		// constants
		int empWagePerHr = 20, is_fullTimeWorkingHrs = 8, is_partTimeWorkingHrs = 4, noOfWorkingDays = 20;

		for (int counter = 1; counter <= noOfWorkingDays; counter++) {

			double empCheck = Math.floor(Math.random() * 10) % 3;

			int empSwitchCheck = (int) empCheck;

			switch (empSwitchCheck) {
				case 1:
					totalEmpWagePerDay = is_fullTimeWorkingHrs * empWagePerHr;
					totalMontlyWageOfEmp = totalMontlyWageOfEmp + totalEmpWagePerDay;
					System.out.println("day" + counter + "employee wage is equal to " + totalEmpWagePerDay);
					break;
				case 2:
					totalEmpWagePerDay = is_partTimeWorkingHrs * empWagePerHr;
					totalMontlyWageOfEmp = totalMontlyWageOfEmp + totalEmpWagePerDay;
					System.out.println("day" + counter + "employee wage is equal to " + totalEmpWagePerDay);
					break;
				default:
					System.out.println("day" + counter + "employee absent " + totalEmpWagePerDay);
			}
		}
		System.out.println("total montly wage of an emp is : " + totalMontlyWageOfEmp);
	}
}
