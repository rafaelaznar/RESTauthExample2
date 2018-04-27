package eu.rafaelaznar.user;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserBean getUserJson() {
        UserDAO oUserDAO = new UserDAO();
        return oUserDAO.get();
    }

    @Path("/{usersNumber}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList getSomeUsersJson(@PathParam("usersNumber") int n) {
        UserDAO oUserDAO = new UserDAO();        
        return oUserDAO.getAll(n);
    }

    
    
    
}
