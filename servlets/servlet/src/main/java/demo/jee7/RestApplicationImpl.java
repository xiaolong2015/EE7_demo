package demo.jee7;

import demo.jee7.ejb.User;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
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
    public String greeting(String name, String auth) {
        String userpass = auth.substring(5); // remove string "Basic "
        byte[] buf = org.apache.commons.codec.binary.Base64.decodeBase64(userpass.getBytes());
        String credential = new String(buf);
        String user = null, password = null;
        int p = credential.indexOf(":");
        if (p > -1) {
            user = credential.substring(0, p);
            password = credential.substring(p+1);
        }
        return "user: " + user + ", password:" + password;
    }
}
