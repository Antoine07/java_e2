package usermanager;

import java.util.Map;

public class User {
    private String name;
    private String email;
    private String password;
    private boolean admin;
    private Map<String, String> preferences;

    User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setPreferences(Map<String, String> preferences) {
        this.preferences = preferences;
    }

    public boolean isAdmin(){

        return this.admin;
    }

    public Map<String, String> getPreferences() {
        return preferences;
    }
}
