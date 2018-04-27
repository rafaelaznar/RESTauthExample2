package eu.rafaelaznar.product;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ProductBean getUserJson() {
        ProductDAO oProductDAO = new ProductDAO();
        return oProductDAO.get();
    }

    @Path("/{productsNumber}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList getSomeProductssJson(@PathParam("productsNumber") int n) {
        ProductDAO oProductDAO = new ProductDAO();        
        return oProductDAO.getAll(n);
    }

    
}
