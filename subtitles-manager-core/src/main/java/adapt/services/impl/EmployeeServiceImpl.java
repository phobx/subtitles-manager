package adapt.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import adapt.dao.EmployeeDao;
import adapt.dto.Employee;
import adapt.services.EmployeeService;

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
		employeeDao.deleteEmployeeById(id);
	}

}
