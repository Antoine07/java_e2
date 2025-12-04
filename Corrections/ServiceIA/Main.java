package ServiceIA;

public class Main {
    public static void main(String[] args) throws Exception {
        AiService ai = new AiService(); // Implémentation IA

        String fullJson = ai
                .askAi("Est ce que 112 est un nombre premier");

        // DEBUG : voir ce que dit l’IA
        System.out.println("\n===== RÉPONSE IA BRUTE =====");
        System.out.println(fullJson);
        System.out.println("===== FIN RÉPONSE IA =====\n");

        Parsing parsing = new Parsing();

        // parsing.exo1();
        // parsing.exo2();
        // parsing.exo3();

        
    }
}
