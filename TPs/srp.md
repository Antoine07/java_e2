# TP 

Les notions suivantes seront abordées dans le TP.

* **SRP**
* **composition**
* **agrégation**

---

# Exercice de synthèse — SRP, Composition, Agrégation

## **Contexte applicatif : système d'accès à un bâtiment**

Vous travaillez sur une application qui doit gérer **l'accès sécurisé** à un bâtiment équipé de portes électroniques.
Chaque employé possède un **badge** avec des informations de sécurité.

L'application doit :

1. gérer les employés et leur badge,
2. gérer les portes et leurs niveaux d'accès,
3. vérifier si un employé peut ouvrir une porte,
4. enregistrer en mémoire les tentatives d'accès (sans console, sans fichiers, sans email).

Les concepts à utiliser :

* **SRP** : chaque classe doit avoir un rôle unique
* **Composition** : un badge appartient entièrement à un employé (il n'existe pas sans lui)
* **Agrégation** : plusieurs portes appartiennent au bâtiment mais peuvent exister indépendamment

---

# 🔥 Code de départ (mauvaise version)

Dans cet exemple, une seule classe fait trop de choses.

```java
public class AccessSystem {
    private List<Employee> employees = new ArrayList<>();
    private List<Door> doors = new ArrayList<>();
    private List<String> logs = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void addDoor(Door d) {
        doors.add(d);
    }

    public boolean checkAccess(Employee e, Door d) {
        if (e.getBadge().getLevel() >= d.getRequiredLevel()) {
            logs.add(e.getName() + " -> accès autorisé à " + d.getId());
            return true;
        } else {
            logs.add(e.getName() + " -> accès refusé à " + d.getId());
            return false;
        }
    }

    public List<String> getLogs() {
        return logs;
    }
}
```

---

# Travail demandé

Refactorisez entièrement le système en séparant clairement les responsabilités.

# Livrables attendus

1. Une organisation en package avec un fichier `settings.json` dans un dossier .vscode (voir le README.md à la racine du projet pour vous aider).
1. UML ou diagramme écrit décrivant les relations (composition, agrégation, ...)
1. Les classes refactorisées
1. Une classe `App` avec un scénario simple d'utilisation (sans affichage)

