package org.sample.controller.service;

import org.sample.controller.exceptions.InvalidTeamException;
import org.sample.controller.pojos.TeamForm;
import org.sample.model.Team;

public interface TeamService {
	public TeamForm createTeam(TeamForm teamForm) throws InvalidTeamException;
	public Iterable<Team> getTeams();
}
