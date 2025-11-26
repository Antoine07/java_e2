package usermanager;

import java.util.HashMap;
import java.util.Map;

public class UserProfilInitializer {
    private String language ;
    private String theme ;
    
    public void initialize(User user){

        if(language != "" && theme != ""){
            Map<String, String> preferences = new HashMap<>() ;
            preferences.put("theme", theme);
            preferences.put("language", language);
    
            user.setPreferences(preferences);
        }
      
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

}
