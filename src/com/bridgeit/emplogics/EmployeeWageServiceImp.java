package com.bridgeit.emplogics;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWageServiceImp implements EmployeeWageService {

	public static final int IS_ABSCENT = 0;
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static final int FULL_TIME_WORKING_HRS = 8;
	public static final int PART_TIME_WORKING_HRS = 4;

	private List<CompanyEmpWage> companies;

	public EmployeeWageServiceImp() {
		companies = new ArrayList<>();
	}

	@Override
	public void addEmpWage(CompanyEmpWage company) {
		companies.add(company);
	}

	@Override
	public void empWageComputation() {

		for (int i = 0; i < companies.size(); i++) {
			CompanyEmpWage company = companies.get(i);
			empWageComputation(company);
			System.out.println(company);
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
}
