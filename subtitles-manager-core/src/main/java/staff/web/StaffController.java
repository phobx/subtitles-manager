package staff.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import staff.services.EmployeeService;

@Controller
public class StaffController {

	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping("staff")
	public ModelAndView showAll() {
		return null;
	}

}
