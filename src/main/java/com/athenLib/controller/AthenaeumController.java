package com.athenLib.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.athenLib.model.Student;
import com.athenLib.model.User;
import com.athenLib.services.AthenaeumServices;
import com.athenLib.services.AthenaeumServicesImpl;

@RestController
@RequestMapping("/athena")
public class AthenaeumController {


	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView method() {
		String projectUrl="http://localhost:8090/athenaLib/index.html";
		return new ModelAndView("redirect:" + projectUrl);

	}*/

	@RequestMapping(value = "/getsession", method = RequestMethod.POST,
			headers={"Accept=application/json", "Content-Type=application/json"})
	public @ResponseBody User getAuthentication(@RequestBody User str) {
		String sessionKey = null;
		str.setUserid("raguji");	
		return str;
	}

 @RequestMapping(value = "/addnew",method =RequestMethod.POST,produces="application/json")
 public @ResponseBody String addNewStudent(@RequestBody Student student){
	 System.out.println(student.toString());
	 AthenaeumServices athenaeumServices = new AthenaeumServicesImpl();
	// athenaeumServices.addStudent(student);
	 return "added";
 }
 
 @RequestMapping(value= "/delete",method=RequestMethod.GET)
 public @ResponseBody String delete(){
	 return 
			 ;
 }
 
}
