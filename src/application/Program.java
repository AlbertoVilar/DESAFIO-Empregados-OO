package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Depatment's name: ");
		String nameDepartment = sc.next();
		System.out.print("Pay day: ");
		Integer payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Phone: ");
		String Phone = sc.next();
		
		Address address = new Address(email, Phone);
		Department department = new Department(nameDepartment, payDay, address);
		
		System.out.println("How many employees are there in the Department");
		Integer N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Data employee " + i + ":");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			Double Salary = sc.nextDouble();
			
			Employee e = new Employee(name, Salary);
			department.addEmployee(e);
						
		}
		//System.out.println(department);
		showReport(department);
		
		  sc.close();
	}
	private static void showReport(Department dept) {
	System.out.println(dept.toString());
		}
}
