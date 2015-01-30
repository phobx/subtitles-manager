import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import staff.dto.Employee;
import staff.services.EmployeeService;

public class TestLauncher {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app-ctx.xml");
		EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");

		List<Employee> staff = employeeService.getAllEmployees();
		for (Employee e : staff) {
			System.out.println(e);
		}

		List<Employee> actualStaff = employeeService.getAllHiredEmployees();
		for (Employee e : actualStaff) {
			System.out.println(e);
		}

	}

}
