package staff.dao;

import java.util.List;

import staff.dto.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

	void updateEmployee(Employee employee);

	void hireEmployeeById(int id);

	void fireEmployeeById(int id);

}
