# TP 

Les notions suivantes seront abordées dans le TP.

* **SRP**
* **composition**
* **agrégation**

---

# 📘 Exercice de synthèse — SRP, Composition, Agrégation

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

    // ❌ mélange logique d'accès + règles métiers
    public boolean checkAccess(Employee e, Door d) {
        if (e.getBadge().getLevel() >= d.getRequiredLevel()) {
            logs.add(e.getName() + " -> accès autorisé à " + d.getId());
            return true;
        } else {
            logs.add(e.getName() + " -> accès refusé à " + d.getId());
            return false;
        }
    }

    // ❌ SRP brisé : gère la journalisation, la logique d'accès et les données
    public List<String> getLogs() {
        return logs;
    }
}
```

---

# Travail demandé

Refactorisez entièrement le système en séparant clairement les responsabilités.

### Contraintes

1. **SRP**

   * Une classe gère les employés
   * Une classe gère les portes
   * Une classe décide si l'accès est autorisé
   * Une classe mémorise les événements (journalisation interne en mémoire)

2. **COMPOSITION**

   * Un `Employee` possède un `Badge`
   * Le badge n'existe pas sans l'employé

3. **AGRÉGATION**

   * Un `Building` agrège plusieurs `Door`
   * Une porte existe indépendamment du bâtiment

4. **AUCUNE dépendance externe**

   * Pas de console, pas de fichiers, pas d'email, pas de prints

5. **Résultat attendu**

   * Un design propre et modulaire
   * Chaque classe a un rôle clair
   * Une méthode centrale `AccessController.check(Employee, Door)`
   * Un journal interne non affiché mais consultable

---

# Livrables attendus

* UML ou diagramme écrit décrivant les relations (composition, agrégation)
* Les classes refactorisées
* Une classe `App` avec un scénario simple d'utilisation (sans affichage)