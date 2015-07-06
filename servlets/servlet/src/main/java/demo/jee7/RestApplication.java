package demo.jee7;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by li on 30.06.2015.
 */
@Path("/")
public interface RestApplication {

    @POST
    @Path("greeting")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public String greeting(String name, @HeaderParam("Authorization") String auth);
}
