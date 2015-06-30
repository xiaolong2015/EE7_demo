package demo.jee7.ejb;

import javax.ejb.Local;

/**
 * Created by li on 27.06.2015.
 */
@Local
public interface UserService {
    public User getUser(String username);
}
