package demo.jee7;

import demo.jee7.ejb.RemoteService;
import demo.jee7.ejb.UserService;
import org.junit.Assert;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by li on 28.06.2015.
 */
public class RemoteEJBInvokerTest {

    /*@Test
    public void testRemoteInvokeEJB() throws NamingException {
        InitialContext context = new InitialContext();
        String jndi = "ear-1.0/ejbs-1.0/RemoteServiceImpl!demo.jee7.ejb.RemoteService";
        RemoteService remoteService = (RemoteService) context.lookup(jndi);
        Assert.assertTrue(remoteService != null);
        Assert.assertEquals(3, remoteService.addition(1, 2));
    }*/
}
