import org.springframework.context.support.ClassPathXmlApplicationContext;

import staff.services.EmployeeService;

public class TestLauncher {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app-ctx.xml");
		EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");
	}

}
