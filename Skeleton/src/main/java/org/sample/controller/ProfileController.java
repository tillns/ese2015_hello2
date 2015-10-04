package org.sample.controller;

import javax.validation.Valid;

import org.sample.controller.exceptions.InvalidUserException;
import org.sample.controller.pojos.TeamForm;
import org.sample.controller.service.ProfileService;
import org.sample.controller.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProfileController {
	@Autowired
	ProfileService profileService;
	
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam("userID") Long id) {
    	ModelAndView model = new ModelAndView("profile");
    	model.addObject("user", profileService.findUser(id));
        return model;
    }
}
