package demo.jee7;

import demo.jee7.ejb.User;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by li on 30.06.2015.
 */
@Stateless
public class RestApplicationImpl implements RestApplication {

    @Context
    private HttpServletRequest servletRequest;

    @EJB
    private demo.jee7.ejb.UserService userService;

    @RolesAllowed("demo")
    public String greeting(String name) {
        Principal principal = servletRequest.getUserPrincipal();
        String authorization = servletRequest.getHeader("Authorization");
        Enumeration<String> header = servletRequest.getHeaderNames();
        List<String> stringHeader = new ArrayList<String>();
        while (header.hasMoreElements()) {
            stringHeader.add(header.nextElement());
        }
        User alice = userService.getUser("alice");
        return (principal == null ? "null principal" : "Principal: " + principal.getName()) + "," + stringHeader + ", " + authorization + ", " + alice.getUsername();
    }
}
