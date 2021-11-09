package com.bridgeit.emplogics;

public class EmpWageComputation {

	public static final int IS_ABSCENT = 0;
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static final int FULL_TIME_WORKING_HRS = 8;
	public static final int PART_TIME_WORKING_HRS = 4;
	
	private final  String companyName;
	private final int totalWorkingHrsInMonth;
	private final int workingDaysInMonth;
	private final int empWagePerHour;
	private int totalMontlyWageOfEmp;
	
	public EmpWageComputation(String companyName, int totalWorkingHrsInMonth, int workingDaysInMonth,
			int empWagePerHour) {
		this.companyName = companyName;
		this.totalWorkingHrsInMonth = totalWorkingHrsInMonth;
		this.workingDaysInMonth = workingDaysInMonth;
		this.empWagePerHour = empWagePerHour;
	}

	public void empWageComputation() {
		
		int totalEmpWagePerDay = 0, totalNoOfHrsWorked = 0, totalNoOfDaysWorked = 0;

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
	}

	@Override
	public String toString() {
		return "EmpWageComputation [companyName=" + companyName + ", totalEmpWage=" + totalMontlyWageOfEmp + "]";
	}

	public static void main(String[] args) {
		EmpWageComputation jio = new EmpWageComputation("jio",100,25,20);
		EmpWageComputation dmart = new EmpWageComputation("dmart",80,25,20);
		EmpWageComputation bigB = new EmpWageComputation("bigB",90,25,20);
		jio.empWageComputation();
		dmart.empWageComputation();
		bigB.empWageComputation();
		System.out.println(jio);
		System.out.println(dmart);
		System.out.println(bigB);
	}
}
