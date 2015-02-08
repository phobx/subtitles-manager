package staff.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import staff.dto.Employee;
import staff.services.EmployeeService;

@Controller
public class StaffController {

	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping("staff")
	public ModelAndView showAll() {
		List<Employee> staff = employeeService.getAllEmployees();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("staff");
		mv.addObject("staff", staff);
		return mv;
	}

}
