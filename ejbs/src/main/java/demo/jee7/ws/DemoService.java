package demo.jee7.ws;

import demo.jee7.ejb.User;

/**
 * Created by li on 27.06.2015.
 */
public interface DemoService {
    public String greeting(String name);
    public User getUser(String username);
}
