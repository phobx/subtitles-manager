package adapt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import adapt.dto.Employee;
import adapt.services.EmployeeService;

@Controller
public class StaffController {

	private EmployeeService employeeService;

	public StaffController() {
		// log
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping("staff")
	public ModelAndView showStaff() {
		List<Employee> staff = employeeService.getAllEmployees();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("staff");
		mv.addObject("staff", staff);
		return mv;
	}

	@RequestMapping(value = "delete-employee.do", method = RequestMethod.POST, consumes = { MediaType.TEXT_PLAIN_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public void deleteEmployee(@RequestBody String body) {
		System.out.println(body);
		if (body.startsWith("delete-employee=")) {
			String s = body.substring(16);
			System.out.println(s);
			try {
				int id = Integer.parseUnsignedInt(s);
				employeeService.deleteEmployeeById(id);
			} catch (NumberFormatException nfe) {
			}
		}
	}

	@RequestMapping(value = "about", method = RequestMethod.GET)
	@ResponseBody
	public List<String> showAbout(@RequestParam(required = false, value = "name") String name) {
		List<String> result = new ArrayList<>();
		String username = (name == null || name == "" ? "username" : name);
		result.add("Hello, " + username + ". This is JSON test.");
		result.add("You are welcome to Subtitle Manager System.");
		result.add("Created in 2015 by phobx.");
		return result;
	}

	@RequestMapping(value = "about", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void showAbout1(@RequestBody List<String> body) {
		for (String a : body) {
			System.out.println(a);
		}
	}

	@RequestMapping(value = "test", method = RequestMethod.GET)
	@ResponseBody
	public Employee testEdit(@RequestParam(required = true, value = "id") int id) {
		return employeeService.getEmployeeById(id);
	}

}
