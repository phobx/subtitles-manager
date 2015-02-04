import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import staff.dto.Employee;
import staff.services.EmployeeService;

public class TestLauncher {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate-app-ctx.xml");
		System.out.println("===========context read===========");
		EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");

		List<Employee> staff = employeeService.getAllEmployees();
		for (Employee e : staff) {
			System.out.println(e);
		}

	}

}
