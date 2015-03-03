package adapt.dao;

import java.util.List;

import adapt.dto.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmployees();

	List<Employee> getAllHiredEmployees();

	Employee getEmployeeById(int id);

	void updateEmployee(Employee employee);

	void deleteEmployeeById(int id);

}
