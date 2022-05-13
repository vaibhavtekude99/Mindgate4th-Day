package com.mindgate.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {

      private Set<Employee> employeeSet=new HashSet<Employee>();
      
      
      // add new Employee
      public boolean addNewEmployee(Employee employee)
      {
    	  if(employee !=null)
    	  {
    	    boolean ans= employeeSet.add(employee);
    	        return ans;
    	  }
    	  return false;
    	  
      }
      
      //update existing employee
      public boolean updateEmployee(Employee employee)
      {
    	 for (Employee setEmployee : employeeSet) {
			if(setEmployee.getEmployeeId()==employee.getEmployeeId())
			{
				setEmployee.setName(employee.getName());
				setEmployee.setSalary(employee.getSalary());
				return true;
			}
		}
    	  
    	  return false;
    	  
      }
      
      //delete Employee
      
      public boolean deleteEmployee(int employeeId)
      {
              for (Employee employee : employeeSet) {
				if(employee.getEmployeeId()==employeeId)
				{
					return employeeSet.remove(employee);
				
				}
			}
    	  return false;
      }
      
      //get single employee by employeeId
      
      public Employee getEmployeeByEmployeeId(int employeeId)
      {
             
 		for (Employee employee : employeeSet)
 		{
			if(employee.getEmployeeId()==employeeId)
			{
				return employee;
			}
		}

 		return null;
 				
    	  
      }
      //get all the Employees
      public Set<Employee> getAllEmployee()
      {
    	  return employeeSet;
      }
      
      
      
}
