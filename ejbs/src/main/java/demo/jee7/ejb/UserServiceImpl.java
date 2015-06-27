package demo.jee7.ejb;

/**
 * Created by li on 27.06.2015.
 */
public class UserServiceImpl implements UserService {
    public User getUser(String username) {
        if ("alice".equals(username)) {
            return new User("Alice", "White", 25, "alice");
        }
        return new User("Bob", "Black", 28, "bob");
    }
}
