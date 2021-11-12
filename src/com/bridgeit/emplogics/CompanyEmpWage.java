package com.bridgeit.emplogics;

import java.util.List;

public class CompanyEmpWage {

	private final String companyName;
	private final int totalWorkingHrsInMonth;
	private final int workingDaysInMonth;
	private final int empWagePerHour;
	public int totalMontlyWageOfEmp;

	public CompanyEmpWage(String companyName, int totalWorkingHrsInMonth, int workingDaysInMonth, int empWagePerHour) {
		this.companyName = companyName;
		this.totalWorkingHrsInMonth = totalWorkingHrsInMonth;
		this.workingDaysInMonth = workingDaysInMonth;
		this.empWagePerHour = empWagePerHour;
	}

	public void setTotalMontlyWageOfEmp(int totalMontlyWageOfEmp) {
		this.totalMontlyWageOfEmp = totalMontlyWageOfEmp;
	} 

	public String getCompanyName() {
		return companyName;
	}

	@Override
	public String toString() {
		return "EmpWageComputation [companyName=" + companyName + ", totalEmpWage=" + getTotalMontlyWageOfEmp() + "]";
	}

	public int getWorkingDaysInMonth() {
		return workingDaysInMonth;
	}

	public int getTotalWorkingHrsInMonth() {
		return totalWorkingHrsInMonth;
	}

	public int getTotalMontlyWageOfEmp() {
		return totalMontlyWageOfEmp;
	}

	public int getEmpWagePerHour() {
		return empWagePerHour;
	}
}
