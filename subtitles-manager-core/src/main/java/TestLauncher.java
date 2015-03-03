import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import adapt.dto.Employee;
import adapt.services.EmployeeService;

public class TestLauncher {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate-app-ctx.xml");
		EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");

		// employeeService.deleteEmployeeById(5);

		List<Employee> staff = employeeService.getAllEmployees();

		for (Employee e : staff) {
			System.out.println(e);
		}

	}

}
