package usermanager;

import java.util.ArrayList;
import java.util.List;

public class UserPermissionService {
    private  List<String> perms = new ArrayList<>();

    public List<String> getPerms(User u) {
        if (u.isAdmin()) {
            perms.add("ACCESS_DASHBOARD");
            perms.add("MANAGE_USERS");
        } else {
            perms.add("ACCESS_PROFILE");
        }
        return perms;
    }
}
