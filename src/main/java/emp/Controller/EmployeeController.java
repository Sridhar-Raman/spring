package emp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import emp.dao.EmployeeDao;
import emp.dto.Employee;

@Controller
public class EmployeeController {
	@Autowired
	Employee emp;
	
	@Autowired
	EmployeeDao dao;
	
	
@GetMapping("load")
public ModelAndView loadEmployee()
{	
	ModelAndView ml=new ModelAndView("Signup.jsp");
	ml.addObject("emp", emp);
	return ml;
}
@PostMapping("signup")
public ModelAndView saveEmployee(@ModelAttribute Employee emp)
{
	dao.signup(emp);
	ModelAndView vl=new ModelAndView("Login.jsp");
	vl.addObject("msg","Account Created Sucessfully");
	return vl;
}
@PostMapping("login")
public ModelAndView login(@RequestParam String email,@RequestParam String pass)
{
	ModelAndView ml=new ModelAndView();
	Employee empl=dao.login(email);
	if(empl==null)
	{
		ml.setViewName("Login.jsp");
		ml.addObject("msg","Email is Wrong...!");
	}
	else
	{
		if(pass.equals(empl.getPassword()))
		{
			ml.setViewName("Result.jsp");
			ml.addObject("list",dao.fetchall());
			ml.addObject("msg","Logged in Sucessfully");
		}
		else{
			ml.setViewName("Login.jsp");
			ml.addObject("msg","Invalid Password");
		}
	}
		return ml;
}
}
