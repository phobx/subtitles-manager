package staff.services;

import java.util.List;

import staff.dto.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

	void addEmployee(Employee employee);

}
