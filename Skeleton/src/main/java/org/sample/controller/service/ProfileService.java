package org.sample.controller.service;

import org.sample.controller.exceptions.InvalidUserException;
import org.sample.model.User;

public interface ProfileService {
	public User findUser(Long id) throws InvalidUserException;
}
