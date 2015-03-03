package adapt.services;

import java.util.List;

import adapt.dto.Employee;

public interface EmployeeService {

	List<Employee> getAllHiredEmployees();

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

	void updateEmployee(Employee employee);

	void deleteEmployeeById(int id);

}
