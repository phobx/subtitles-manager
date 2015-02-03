package staff.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import staff.dao.EmployeeDao;
import staff.dto.Employee;

public class EmployeeHibernateDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllHiredEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hireEmployeeById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fireEmployeeById(int id) {
		// TODO Auto-generated method stub

	}

}
