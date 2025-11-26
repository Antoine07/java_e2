package usermanager;
import java.util.*;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(User u) {
        users.add(u);
    }
}