package staff.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import staff.dao.EmployeeDao;
import staff.dto.Employee;
import staff.services.EmployeeService;

@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);

	}

	@Override
	public List<Employee> getAllHiredEmployees() {
		return employeeDao.getAllHiredEmployees();
	}

	@Override
	// weak delete
	public void deleteEmployeeById(int id) {
		Employee employee = employeeDao.getEmployeeById(id);
		employee.setVisible(false);
		employeeDao.updateEmployee(employee);
	}

}
