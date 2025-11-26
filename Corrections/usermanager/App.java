package usermanager;
import java.util.List;

public class App {
    public static void main(String[] args) {
        UserPermissionService userPermission = new UserPermissionService();
        UserProfilInitializer userProfil = new UserProfilInitializer();

        User alan = new User("alan", "alan@alan.fr", "123");
        User alice = new User("alice", "alice@alice.fr", "123");
        User ada = new User("ada", "ada@ada.fr", "123");

        alan.setAdmin(true);
        alice.setAdmin(false);
        ada.setAdmin(false);

        // plus loin dans l'application on peut vérifier quelles permissions il possède ?
        List<String> perms = userPermission.getPerms(alan);
        System.out.println(alan.getName());
        for(String perm: perms) System.out.println(perm);

        // ajouter des préférence
        userProfil.setLanguage("en");
        userProfil.setTheme("dark");

        userProfil.initialize(alan);

        for(String pref: alan.getPreferences().values()) System.out.println(pref);

    }
}
