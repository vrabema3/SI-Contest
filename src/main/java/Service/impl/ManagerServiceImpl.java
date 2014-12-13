package Service.impl;

import Service.ManagerService;
import persistance.dao.ContestDAO;
import persistance.dao.PersonDAO;
import persistance.dao.TeamDAO;
import persistance.dao.impl.ContestDAOImpl;
import persistance.dao.impl.PersonDAOImpl;
import persistance.dao.impl.TeamDAOImpl;
import persistance.model.Contest;
import persistance.model.State;
import persistance.model.Team;

/**
 * Created by martin on 07-Dec-14.
 */
public class ManagerServiceImpl implements ManagerService {
    TeamDAO teamDAO = new TeamDAOImpl();
    PersonDAO personDAO = new PersonDAOImpl();
    ContestDAO contestDAO = new ContestDAOImpl();

    @Override
    public void registerTeamToContest(Team team, Contest contest) {
        team.setAttendsContest(contest);
        teamDAO.updateTeam(team);
    }

    @Override
    public void setTeamState(Team team, State state) {
        team.setState(state);
        teamDAO.updateTeam(team);
    }
}
