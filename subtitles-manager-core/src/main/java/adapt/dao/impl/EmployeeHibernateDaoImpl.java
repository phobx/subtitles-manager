package adapt.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateTemplate;

import adapt.dao.EmployeeDao;
import adapt.dto.Employee;

public class EmployeeHibernateDaoImpl implements EmployeeDao {

	public static final String ENTITY_EMPLOYEE = "Employee";
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		DetachedCriteria dc = DetachedCriteria.forEntityName(ENTITY_EMPLOYEE);
		List<Employee> employees = (List<Employee>) hibernateTemplate.findByCriteria(dc);
		return employees;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllHiredEmployees() {
		DetachedCriteria dc = DetachedCriteria.forEntityName(ENTITY_EMPLOYEE);
		dc.add(Restrictions.eqOrIsNull("hired", true));
		List<Employee> employees = (List<Employee>) hibernateTemplate.findByCriteria(dc);
		return employees;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = (Employee) hibernateTemplate.get(ENTITY_EMPLOYEE, id);
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {
		hibernateTemplate.saveOrUpdate(ENTITY_EMPLOYEE, employee);

	}

	@Override
	public void deleteEmployeeById(int id) {
		Employee employee = (Employee) hibernateTemplate.get(ENTITY_EMPLOYEE, id);
		hibernateTemplate.delete(ENTITY_EMPLOYEE, employee);

	}

}
