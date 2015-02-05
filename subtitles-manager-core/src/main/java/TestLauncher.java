import org.springframework.context.support.ClassPathXmlApplicationContext;

import staff.services.EmployeeService;

public class TestLauncher {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate-app-ctx.xml");
		EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");

		for (int i = 1; i < 11; i++) {
			System.out.println(i + " : " + employeeService.getEmployeeById(i));
		}

		employeeService.hireEmployeeById(5);
	}

}
