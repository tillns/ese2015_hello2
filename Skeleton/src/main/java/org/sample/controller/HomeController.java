package org.sample.controller;

import org.sample.controller.pojos.SignupForm;
import org.sample.controller.service.SampleService;
import org.sample.controller.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public ModelAndView index() {
    	ModelAndView model = new ModelAndView("home");
        return model;
    }	
	
}
