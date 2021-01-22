package challenges.flow;

import flow.AgentException;
import flow.IAction;
import flow.IAgent;

import java.util.LinkedList;
import java.util.List;

public class UserAgent implements IAgent {
    private String user;

    public UserAgent(String user) {
        this.user = user;
    }

    public List<IAction> act() throws AgentException {
        List<IAction> flow = new LinkedList<IAction>();
        flow.add(new EmailAction(user));
        return flow;
    }
}