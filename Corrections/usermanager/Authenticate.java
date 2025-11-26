package usermanager;

import java.util.ArrayList;
import java.util.List;

public class Authenticate {
    private List<User> users = new ArrayList<>();

    Authenticate(List<User> users) {
        this.users = users;
    }

    boolean auth(String email, String password) {
        for (User u : users) {
            if (u.getEmail().equals(password) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    void addUser(User user) {
        if (!this.users.contains(user))
            this.users.add(user);
    }

}