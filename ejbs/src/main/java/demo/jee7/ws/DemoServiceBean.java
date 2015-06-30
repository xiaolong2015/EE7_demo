package demo.jee7.ws;

import demo.jee7.ejb.User;
import demo.jee7.ejb.UserService;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by li on 27.06.2015.
 */
@Stateless
@WebService(name = "Demo", portName = "DemoPort", serviceName = "DemoService")
public class DemoServiceBean implements DemoService {

    @EJB
    private UserService userService;

    @WebMethod()
    @RolesAllowed("demo")
    public String greeting(@WebParam String name) {
        return "hello " + name + "!";
    }

    @WebMethod()
    @RolesAllowed("demo")
    public User getUser(@WebParam String username) {
        return userService.getUser(username);
    }
}
