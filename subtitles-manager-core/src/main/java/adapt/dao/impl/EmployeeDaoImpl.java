package adapt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import adapt.dao.EmployeeDao;
import adapt.dto.Employee;

@Deprecated
// and not fully implemented
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try (Connection connection = getConnection()) {
			PreparedStatement ps = connection.prepareStatement("select * from adaptation_employee");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setFirstName(rs.getString("first_name"));
				employee.setLastName(rs.getString("last_name"));
				employee.setEmail(rs.getString("email"));
				// employee.setHired(rs.getInt("is_hired") != 0);
				list.add(employee);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
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
	public List<Employee> getAllHiredEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try (Connection connection = getConnection()) {
			PreparedStatement ps = connection.prepareStatement("select * from adaptation_employee where is_hired != 0");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setFirstName(rs.getString("first_name"));
				employee.setLastName(rs.getString("last_name"));
				employee.setEmail(rs.getString("email"));
				// employee.setHired(rs.getInt("is_hired") != 0);
				list.add(employee);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub

	}

}
