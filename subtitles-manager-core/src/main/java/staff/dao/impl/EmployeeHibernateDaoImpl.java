package staff.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import staff.dao.EmployeeDao;
import staff.dto.Employee;

public class EmployeeHibernateDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	public static final String ENTITY_EMPLOYEE = "Employee";

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		DetachedCriteria dc = DetachedCriteria.forEntityName(ENTITY_EMPLOYEE);
		dc.add(Restrictions.eqOrIsNull("visible", true));
		List<Employee> employees = (List<Employee>) getHibernateTemplate().findByCriteria(dc);
		return employees;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllHiredEmployees() {
		DetachedCriteria dc = DetachedCriteria.forEntityName(ENTITY_EMPLOYEE);
		dc.add(Restrictions.eqOrIsNull("visible", true)).add(Restrictions.eqOrIsNull("hired", true));
		List<Employee> employees = (List<Employee>) getHibernateTemplate().findByCriteria(dc);
		return employees;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = (Employee) getHibernateTemplate().get(ENTITY_EMPLOYEE, id);
		if (employee == null) {
			return null;
		}
		return (employee.isVisible() ? employee : null);
	}

	@Override
	public void updateEmployee(Employee employee) {
		getHibernateTemplate().saveOrUpdate(ENTITY_EMPLOYEE, employee);

	}

	@Override
	public void hireEmployeeById(int id) {
		Employee employee = (Employee) getHibernateTemplate().get(ENTITY_EMPLOYEE, id);
		employee.setHired(true);
		getHibernateTemplate().saveOrUpdate(ENTITY_EMPLOYEE, employee);
	}

	@Override
	public void fireEmployeeById(int id) {
		Employee employee = (Employee) getHibernateTemplate().get(ENTITY_EMPLOYEE, id);
		employee.setHired(false);
		getHibernateTemplate().saveOrUpdate(ENTITY_EMPLOYEE, employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		Employee employee = (Employee) getHibernateTemplate().get(ENTITY_EMPLOYEE, id);
		employee.setVisible(false);
		getHibernateTemplate().saveOrUpdate(ENTITY_EMPLOYEE, employee);

	}

}
