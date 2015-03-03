package adapt;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import adapt.services.EmployeeService;

public class TestContext extends TestCase {

	public void testContextCreation() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate-app-ctx.xml");
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		assertNotNull(employeeService);
		context.close();
	}

}
