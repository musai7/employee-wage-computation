package com.bridgeit.emplogics;

public class EmpWageComputation {

	public static final int IS_ABSCENT = 0;
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static final int FULL_TIME_WORKING_HRS = 8;
	public static final int PART_TIME_WORKING_HRS = 4;

	private int numberOfCompanies = 0;
	CompanyEmpWage companyEmpWage[];

	public EmpWageComputation() {
		companyEmpWage = new CompanyEmpWage[5];
	}

	public void addEmpWage(String companyName, int totalWorkingHrsInMonth, int workingDaysInMonth, int empWagePerHour) {
		companyEmpWage[numberOfCompanies++] = new CompanyEmpWage(companyName, totalWorkingHrsInMonth,
				workingDaysInMonth, empWagePerHour);
	}

	public void empWageComputation() {
		for(int i = 0;i < numberOfCompanies;i++) {
			companyEmpWage[i].setTotalMontlyWageOfEmp(this.empWageComputation(companyEmpWage[i]));
			System.out.println(companyEmpWage[i]);
		}
		
	}

	public int empWageComputation(CompanyEmpWage companyEmpWage) {

		int totalEmpWagePerDay = 0, totalNoOfHrsWorked = 0, totalNoOfDaysWorked = 0;

		while (totalNoOfDaysWorked <= companyEmpWage.getWorkingDaysInMonth()
				&& totalNoOfHrsWorked <= companyEmpWage.getTotalWorkingHrsInMonth()) {

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case IS_PRESENT:
				totalNoOfHrsWorked = totalNoOfHrsWorked + FULL_TIME_WORKING_HRS;
				totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
				totalEmpWagePerDay = FULL_TIME_WORKING_HRS * companyEmpWage.getEmpWagePerHour();
				companyEmpWage.totalMontlyWageOfEmp = companyEmpWage.totalMontlyWageOfEmp + totalEmpWagePerDay;
				break;
			case IS_PART_TIME:
				totalNoOfHrsWorked = totalNoOfHrsWorked + PART_TIME_WORKING_HRS;
				totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
				totalEmpWagePerDay = PART_TIME_WORKING_HRS * companyEmpWage.getEmpWagePerHour();
				companyEmpWage.totalMontlyWageOfEmp = companyEmpWage.totalMontlyWageOfEmp + totalEmpWagePerDay;
				break;
			default:
				totalNoOfDaysWorked = totalNoOfDaysWorked + 1;
			}
		}
		return companyEmpWage.totalMontlyWageOfEmp;
	}

	public static void main(String[] args) {
		EmpWageComputation empWageComputation = new EmpWageComputation();
		empWageComputation.addEmpWage("jio", 100, 20, 20);
		empWageComputation.addEmpWage("BigB", 90, 20, 30);
		empWageComputation.addEmpWage("reliance", 80, 25, 25);
		empWageComputation.empWageComputation();
	}
}
