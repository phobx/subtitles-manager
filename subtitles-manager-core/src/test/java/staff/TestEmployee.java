package staff;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import staff.services.EmployeeService;

public class TestEmployee extends TestCase {

	private ClassPathXmlApplicationContext ctx;
	private EmployeeService employeeService;

	@Override
	protected void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("hibernate-test-app-ctx.xml");
		employeeService = (EmployeeService) ctx.getBean("employeeService");
	}

	@Override
	protected void tearDown() throws Exception {
		ctx.close();
	}

}
