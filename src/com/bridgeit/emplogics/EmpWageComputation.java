package com.bridgeit.emplogics;

public class EmpWageComputation {

	public static void main(String[] args) {
		EmployeeWageService employeeWageService = new EmployeeWageServiceImp();
		CompanyEmpWage jioCompany = new CompanyEmpWage("jio", 100, 20, 20);
		CompanyEmpWage bigB = new CompanyEmpWage("bigB", 90, 20, 30);
		CompanyEmpWage reliance = new CompanyEmpWage("reliance", 80, 25, 25);
		employeeWageService.addEmpWage(jioCompany);
		employeeWageService.addEmpWage(bigB);
		employeeWageService.addEmpWage(reliance);
		employeeWageService.empWageComputation();
	}
}
