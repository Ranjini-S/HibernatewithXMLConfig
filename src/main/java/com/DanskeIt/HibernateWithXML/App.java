package com.DanskeIt.HibernateWithXML;

import com.DanskeIt.HibernateWithXML.dao.EmployeeDAO;
import com.DanskeIt.HibernateWithXML.model.Employee;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Ranjini", "S", 8978);

		EmployeeDAO employeeDAO = new EmployeeDAO();

		employeeDAO.saveEmployee(employee);

		System.out.println(employee.getEmployeeId());
	}

}
