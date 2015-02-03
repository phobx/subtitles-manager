package staff.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import staff.dao.EmployeeDao;
import staff.dto.Employee;

public class EmployeeHibernateDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	public static final String ENTITY_EMPLOYEE = "Employee";

	@Override
	public List<Employee> getAllEmployees() {
		DetachedCriteria dc = DetachedCriteria.forEntityName(ENTITY_EMPLOYEE);
		dc.add(Restrictions.eqOrIsNull("isVisible", true));
		List<Employee> employees = (List) getHibernateTemplate().findByCriteria(dc);
		return employees;
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
