package org.sample.controller.service;

import org.sample.controller.exceptions.InvalidUserException;
import org.sample.controller.pojos.SignupForm;
import org.sample.model.Address;
import org.sample.model.User;
import org.sample.model.dao.AddressDao;
import org.sample.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class ProfileServiceImpl implements ProfileService{
	 	@Autowired    UserDao userDao;
	    @Autowired    AddressDao addDao;
	    
	    @Transactional
	    public User findUser(Long id) throws InvalidUserException{

	        User user = userDao.findOne(id);

	        if(user == null) {
	            throw new InvalidUserException("Sorry, there is no user with this id");   // throw exception
	        }

	        return user;

	    }
	

}
