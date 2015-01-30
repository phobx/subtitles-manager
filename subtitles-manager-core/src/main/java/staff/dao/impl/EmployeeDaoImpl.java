package staff.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import staff.dao.EmployeeDao;
import staff.dto.Employee;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() {
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
