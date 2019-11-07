package Controler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.client;

@Controller
public class ControlerDemo 
{

	ApplicationContext ap=new ClassPathXmlApplicationContext("appcon.xml");
	
	@RequestMapping("/home")
	public String view()
	{
	return "home";
	}
	
	@RequestMapping("/register")
	public String view1(Model m)
	{
	client cobj=ap.getBean("info",client.class);
	m.addAttribute("bean",cobj);
	return "register";
	}
	

	@RequestMapping("/save")
	public String saveDetails(client c,Model m)
	{
	client cobj=ap.getBean("info",client.class);
	m.addAttribute("bean",cobj);
	return "home";
	}
	

	
	
}
