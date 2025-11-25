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

# ✔️ 2. Configurer VS Code pour utiliser la bonne version de Java

1. Ouvrir la palette de commandes dans VS Code :
   **Cmd + Shift + P** (macOS)
   **Ctrl + Shift + P** (Windows)
2. Taper :
   **Java: Configure Java Runtime**
3. Dans la section **JDKs**, ajouter ou sélectionner le JDK installé (ex. **JavaSE-21**)

---

# 3. Extensions nécessaires dans VS Code

### Extension indispensable :

✔ **Extension Pack for Java** (Microsoft)

Ce pack inclut automatiquement :

* Language Support for Java™ (Red Hat)
* Debugger for Java
* Java Test Runner
* Maven for Java
* Java Dependency Viewer

⚠️ Il n'est pas nécessaire d'installer *Language Support for Java* séparément.
