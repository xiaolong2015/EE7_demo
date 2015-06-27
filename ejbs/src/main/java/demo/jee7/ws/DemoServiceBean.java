package demo.jee7.ws;

import demo.jee7.ejb.User;
import demo.jee7.ejb.UserService;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by li on 27.06.2015.
 */
@Stateless
@WebService(name = "DemoService", portName = "DemoServicePort", serviceName = "DemoService")
public class DemoServiceBean implements DemoService {

    @EJB
    private UserService userService;

    @WebMethod()
    @RolesAllowed({"admin"})
    public String greeting(String name) {
        return "hello " + name + "!";
    }

    @WebMethod()
    @RolesAllowed({"admin"})
    public User getUser(String username) {
        return userService.getUser(username);
    }
}
