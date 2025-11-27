package usermanager;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Services métier :
        // - UserPermissionService : fournit les permissions d'un utilisateur
        // - UserProfilInitializer : initialise les préférences d'un utilisateur
        UserPermissionService userPermission = new UserPermissionService();
        UserProfilInitializer userProfil = new UserProfilInitializer();

        // Création de trois utilisateurs avec nom, email et mot de passe
        User alan = new User("alan", "alan@alan.fr", "123");
        User alice = new User("alice", "alice@alice.fr", "123");
        User ada = new User("ada", "ada@ada.fr", "123");

        // Définition des rôles administrateur
        alan.setAdmin(true);
        alice.setAdmin(false);
        ada.setAdmin(false);

        // Récupération des permissions d'un utilisateur :
        // UserPermissionService.getPerms(User) renvoie une liste de chaînes
        List<String> perms = userPermission.getPerms(alan);

        // Affichage du nom de l'utilisateur puis de chacune de ses permissions
        System.out.println(alan.getName());
        for (String perm : perms) {
            System.out.println(perm);
        }

        // Définition des préférences par défaut dans le service d'initialisation
        userProfil.setLanguage("en");
        userProfil.setTheme("dark");

        // Application des préférences sur l'utilisateur
        userProfil.initialize(alan);

        // Parcours et affichage des valeurs de préférences stockées dans l'utilisateur
        // alan.getPreferences() retourne visiblement une Map<String, String>
        for (String pref : alan.getPreferences().values()) {
            System.out.println(pref);
        }

        List<User> users = new ArrayList<>();

        users.add(alan);
        users.add(alice);
        users.add(ada);

        Authenticate authenticate = new Authenticate(users);

        // test de la méthode auth 
        System.out.println( authenticate.auth("alan@alan.fr", "123"));
        System.out.println( authenticate.auth("alice@alice.fr", "123"));
        System.out.println( authenticate.auth("alice@alice.fr", "1234"));
        System.out.println( authenticate.auth("benard@bernard.fr", "123"));

    }
}
