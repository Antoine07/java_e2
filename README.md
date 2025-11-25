#  Installation / Mise à jour de Java (Windows & macOS)

Vous pouvez avoir plusieurs versions de Java installées sur votre machine, il faut cependant configurer votre VS Code pour choisir la bonne version.

Sur macOS :
`ls /Library/Java/JavaVirtualMachines/`

Sur Windows (invite de commande) :
`dir "C:\Program Files\Java"`
ou
`dir "C:\Program Files\Eclipse Adoptium"`

---

## 1. Télécharger un JDK moderne

Rendez-vous sur :
**[https://adoptium.net/fr/temurin/releases](https://adoptium.net/fr/temurin/releases)**

Puis :

* **Choisir JDK (pas JRE)**
* Version recommandée : **21 (LTS)**
* Sélectionner votre système :

  * **Windows x64**
  * **macOS aarch64** (Mac M1 / M2 / M3 / M4)
  * **macOS x64** (anciens Mac Intel)
* Télécharger et installer le fichier proposé (.msi sous Windows / .pkg sous macOS)

---

#  2. Configurer VS Code pour utiliser la bonne version de Java

1. Ouvrir la palette de commandes dans VS Code :
   **Cmd + Shift + P** (macOS)
   **Ctrl + Shift + P** (Windows)
2. Taper :
   **Java: Configure Java Runtime**
3. Dans la section **JDKs**, ajouter ou sélectionner le JDK installé (ex. **JavaSE-21**)

---

# 3. Extensions nécessaires dans VS Code

### Extension indispensable :

**Extension Pack for Java** (Microsoft)

Ce pack inclut automatiquement :

* Language Support for Java™ (Red Hat)
* Debugger for Java
* Java Test Runner
* Maven for Java
* Java Dependency Viewer

Il n'est pas nécessaire d'installer *Language Support for Java* séparément.

## Fichier de settings.json 

Vous pouvez configurez votre projet pour définir un dossier racine pour vos packages.

Dans le dossier, créez le si il n'existe pas, `.vscode` à la racine du projet, et créez le fichier `settings.json`

```json
{
    // Masque les fichiers .log dans l’explorateur
    "files.exclude": {
        "**/*.log": true
    },

    // Taille de police confortable pour coder en classe
    "editor.fontSize": 16,

    // Tabulations de 4 espaces (standard pédagogique)
    "editor.tabSize": 4,

    // Retour automatique à la ligne pour éviter le scroll horizontal
    "editor.wordWrap": "on",

    // Met à jour automatiquement la configuration Java
    // Évite les pop-ups « update build configuration »
    "java.configuration.updateBuildConfiguration": "automatic",

    // Ignore les erreurs de classpath incomplet
    // Permet de travailler avec un simple fichier Main.java hors projet
    "java.errors.incompleteClasspath.severity": "ignore",

    // Cache la section “Open Editors” pour alléger l’interface
    "explorer.openEditors.visible": 0,

    // Aucun dossier n’est considéré comme source java par défaut
    // → les étudiants peuvent choisir un dossier racine librement
    "java.project.sourcePaths": [
      "projet_java",
      "Cart"
   ],

    // Aucune bibliothèque externe imposée
    "java.project.referencedLibraries": []
}
```


# Coder directement dans VS Code (vidéo)

![Installation](./docs/assets/hello_world.gif)

# Création d'un projet Java

Vous pouvez également créer un projet Java

Dans VS Code tapez : ctrl + shift + p

Cette installation est intéressante pour le débug Java et la complémention automatique dans VS Code.

1. Cherchez Java Create Project
1. No build tools
1. Choisissez un dossier 
1. Nommez votre projet

# Création d'un projet (en vidéo)

![projets](./docs/assets/project.gif)

#  Exécuter un programme Java

Placez-vous à la racine du projet, puis utilisez le bouton **run**

▶ **Run**

Sinon via Terminal :

```bash
javac Hello.java
java Hello
```
