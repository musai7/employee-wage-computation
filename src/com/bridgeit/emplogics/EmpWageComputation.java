package com.bridgeit.emplogics;

public class EmpWageComputation {
	public static void main(String[] args) {
		// employee present or absent logic
		int is_Present = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == is_Present) {
			System.out.println("employee is present");
		} else
			System.out.println("employee is abscent ");
	}
}
