package org.cap.controller;

import java.util.ArrayList;
import java.util.List;

import org.cap.entities.Trainee;
import org.cap.exceptions.AdminServiceImpl;
import org.cap.exceptions.IAdminService;
import org.cap.service.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MyController {
	
	@Autowired
	private ITraineeService service;
	
	
	
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mv=new ModelAndView("login");
		System.out.println("login page");
		return mv;
	}
	
	@GetMapping("/processlogin")
	public ModelAndView getLoginValue(@RequestParam("tname")String name,@RequestParam("tpassword")String password)
	{ 	System.out.println(password+name);
		System.out.println("hiii.. cheecking");
		ModelAndView mv=new ModelAndView("Homepage");
		return mv;
		}
	
	@GetMapping("/add")
	public ModelAndView addDetails()
	{	
		ModelAndView mv=new ModelAndView("addtrainee");
		return mv;
	}

	@GetMapping("/processadd")
	public ModelAndView processDetails(@RequestParam("tid")int id,@RequestParam("tname") String name
			,@RequestParam(value="asSelected" )String  location ,@RequestParam(value="optionvalue" )String  domain )
	{
		System.out.println(id+" "+name+" "+location+" "+domain);
		Trainee trainee =new Trainee();
		trainee.setTraineeId(id);
		trainee.setTraineeName(name);
		trainee.setTraineeDomain(domain);
		trainee.setTraineeLocation(location);
		System.out.println(trainee);
		trainee=service.addTrainee(trainee);
		System.out.println(trainee);
		System.out.println("added");
		ModelAndView mv=new ModelAndView("traineedetail","trainee",trainee);
		return mv;
	}	//request comes from homepage.jsp  to delete 
	@GetMapping("/delete")
	public ModelAndView methodDelete()
	{	
		
		ModelAndView mv=new ModelAndView("processdelete");
		return mv;
	}
	@GetMapping("/deletedone")
	public ModelAndView processDelete(@RequestParam("tid")int id)
	{	Trainee trainee=new Trainee();
		trainee.setTraineeId(id);
		 trainee=service.deleteTrainee(id);
		 
		ModelAndView mv=new ModelAndView("traineedetail","trainee",trainee);
		System.out.println("deleted"+trainee);
		return mv;
	}
	
	
	@GetMapping("/modify")
	public ModelAndView methodmodify()
	{	
		
		ModelAndView mv=new ModelAndView("processmodify");
		return mv;
	}
	@GetMapping("/modifydone")
	public ModelAndView processModify(@RequestParam("tid")int id,@RequestParam("tname") String name,
			@RequestParam("tdomain")String domain
			,@RequestParam("tlocation")String location)
	{	Trainee trainee=service.findById(id);
		trainee=service.modifyTrainee(id, name, domain,location);
		ModelAndView mv=new ModelAndView("traineedetail","trainee",trainee);
		
		System.out.println("modify"+trainee);
		return mv;
	}
	
	@GetMapping("/retrieve")
	public ModelAndView methodRetrieve()
	{	
		
		ModelAndView mv=new ModelAndView("processretrieve");
		
		
		return mv;
	}
	@GetMapping("/retrievedone")
	public ModelAndView processRetrieve(@RequestParam("id")int id)
	{	Trainee trainee=new Trainee();
		trainee.setTraineeId(id);
		System.out.println(trainee);
		trainee=service.retrieveTrainee(id);
		 System.out.println(trainee);
		ModelAndView mv=new ModelAndView("retrievedetails","trainee",trainee);
		System.out.println("Retrieved"+trainee);
		return mv;
	}
	
	@GetMapping("/retrieveall")
	public ModelAndView methodRetrieveAll()
	{	List<Trainee> trainee=new ArrayList<>();
		 trainee=service.retrieveall();
		ModelAndView mv=new ModelAndView("processretrieveall","traineelist",trainee);
		
		
		return mv;
	}
	
	
	
	
}























