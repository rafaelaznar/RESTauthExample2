package eu.rafaelaznar.product;

import eu.rafaelaznar.user.*;
import java.util.ArrayList;

public class ProductDAO {

    public ProductBean get() {
        ProductBean oProduct = new ProductBean();
        oProduct.setCode("U76876Z");
        oProduct.setName("Lijadora");
        return oProduct;
    }

    public ArrayList getAll(int len) {
        ArrayList alUsers = new ArrayList<>();
        for (int c = 1; c <= len; c++) {
            alUsers.add(this.get());
        }
        return alUsers;
    }
}
