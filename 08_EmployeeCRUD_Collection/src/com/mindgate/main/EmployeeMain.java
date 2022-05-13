package com.mindgate.main;

import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		EmployeeDAO employeeDAO = new EmployeeDAO();
		String continuechoice;
		int employeeId;
		int choice;
		String name;
		double salary;
		Employee employee;

		do {

			System.out.println("Please Enter Your Choice");
			System.out.println("1. For add new Employee");
			System.out.println("2. For update employee ");
			System.out.println("3. For delete employee by Id");
			System.out.println("4. For to get single employee details");
			System.out.println("5. For Get all employees ");

			 choice = scanner.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("Please enter the epmloyeeI");
				 employeeId = scanner.nextInt();

				System.out.println("Please enter the employee name: ");
				 name = scanner.next();

				System.out.println("Please enter Employee Salary: ");
				salary = scanner.nextDouble();

	             employee = new Employee(employeeId, name, salary);
				if (employeeDAO.addNewEmployee(employee)) {
					System.out.println("The employee Added successfully");
				} else {
					System.out.println("Failed to add the employee");
				}
				break;
			}
			case 2: {
				System.out.println("Please enter the epmloyeeId");
				  employeeId = scanner.nextInt();

				System.out.println("Please enter the  new employee name: ");
				 name = scanner.next();

				System.out.println("Please enter Employee new Salary: ");
				 salary = scanner.nextDouble();

				 employee = new Employee(employeeId, name, salary);
				if (employeeDAO.updateEmployee(employee)) {
					System.out.println("Updated Successfully");
				} else
					System.out.println("Unable to update");
				break;
			}
			case 3: {
				System.out.println("Please enter the epmloyeeId");
				employeeId = scanner.nextInt();

				if (employeeDAO.deleteEmployee(employeeId)) {
					System.out.println("Deleted Successfully");
				} else
					System.out.println("Unable to delete");

				break;
			}
			case 4: {
				System.out.println("Please enter the epmloyeeId");
				  employeeId = scanner.nextInt();

				System.out.println(employeeDAO.getEmployeeByEmployeeId(employeeId));

				break;
			}
			case 5: {
				Set<Employee> employeeSet = employeeDAO.getAllEmployee();
				for (Employee employee2 : employeeSet) {
					System.out.println(employee2);
				}
				break;
			}
			default:
				System.out.println("You entered wrong input");
				break;
			}
			System.out.println("if you want to continue enter yes otherwise no");
			continuechoice = scanner.next();

		} while (continuechoice.equals("yes"));

		System.out.println("Thank you!!!!!!!!!`");

	}

}
