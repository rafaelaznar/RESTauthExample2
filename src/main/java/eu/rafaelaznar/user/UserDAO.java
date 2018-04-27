package eu.rafaelaznar.user;

import java.util.ArrayList;

public class UserDAO {

    public UserBean get() {
        UserBean user = new UserBean();
        user.setFirstName("Rafael");
        user.setLastName("Aznar");
        return user;
    }

    public ArrayList getAll(int len) {
        ArrayList alUsers = new ArrayList<>();
        for (int c = 1; c <= len; c++) {
            alUsers.add(this.get());
        }
        return alUsers;
    }
}
