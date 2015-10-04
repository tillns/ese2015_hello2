package org.sample.controller.service;

import java.util.Date;

import org.sample.controller.exceptions.InvalidTeamException;
import org.sample.controller.exceptions.InvalidUserException;
import org.sample.controller.pojos.SignupForm;
import org.sample.controller.pojos.TeamForm;
import org.sample.model.Address;
import org.sample.model.Team;
import org.sample.model.User;
import org.sample.model.dao.AddressDao;
import org.sample.model.dao.TeamDao;
import org.sample.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


@Service
public class TeamServiceImpl implements TeamService {

    @Autowired    
    TeamDao teamDao;
    
    @Transactional
	public TeamForm createTeam(TeamForm teamForm) throws InvalidTeamException{
		Team team = new Team();
		team.setName(teamForm.getTeam());
		if(team.getName().isEmpty())
			throw new InvalidTeamException("Vollhorst, schreib mal was");
		team.setDate(new Date());
		team = teamDao.save(team);
		return teamForm;
	}

	public Iterable<Team> getTeams() {
		return teamDao.findAll();
	}
}
