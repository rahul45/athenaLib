package com.athenLib.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.athenLib.model.User;

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
}
