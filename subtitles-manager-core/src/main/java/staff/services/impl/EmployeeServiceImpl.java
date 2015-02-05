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
	public void hireEmployeeById(int id) {
		employeeDao.hireEmployeeById(id);
	}

	@Override
	public void fireEmployeeById(int id) {
		employeeDao.fireEmployeeById(id);

	}

	@Override
	public List<Employee> getAllHiredEmployees() {
		return employeeDao.getAllHiredEmployees();
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeDao.deleteEmployeeById(id);

	}

}
