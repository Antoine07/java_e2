package ServiceIA;

public class Parsing {

    public void exo1() {
        String text = "row=2, col=1";

        // Extraction de row
        int rowIndex = text.indexOf("row");
        int rowEquals = text.indexOf("=", rowIndex);
        // [, ] == virgule ou espace
        String rowValue = text.substring(rowEquals + 1).trim().split("[, ]")[0];
        int row = Integer.parseInt(rowValue);

        // Extraction de col
        int colIndex = text.indexOf("col");
        int colEquals = text.indexOf("=", colIndex);
        String colValue = text.substring(colEquals + 1).trim();
        int col = Integer.parseInt(colValue);

        // Affichage
        System.out.println("row = " + row);
        System.out.println("col = " + col);
    }

    public void exo2() {
        String json = "{\"row\":2,\"col\":1}";

        // Extraction de row
        int rowIndex = json.indexOf("\"row\"");
        int rowColon = json.indexOf(":", rowIndex);
        int row = Integer.parseInt(
                json.substring(rowColon + 1).trim().split("[^0-9]+")[0]);

        // Extraction de col
        int colIndex = json.indexOf("\"col\"");
        int colColon = json.indexOf(":", colIndex);
        int col = Integer.parseInt(
                json.substring(colColon + 1).trim().split("[^0-9]+")[0]);

        // Affichage
        System.out.println("row = " + row);
        System.out.println("col = " + col);
    }

    public void exo3() {

        String raw = "[{\"row\":0,\"col\":0}, {\"row\":1,\"col\":2}]";

        int searchIndex = 0;

        while (true) {

            // Trouver "row"
            int rowIndex = raw.indexOf("\"row\"", searchIndex);
            if (rowIndex == -1) {
                break; // fin du tableau
            }

            int rowColon = raw.indexOf(":", rowIndex);
            int row = Integer.parseInt(
                    raw.substring(rowColon + 1).trim().split("[^0-9]+")[0]
            );

            // Trouver "col"
            int colIndex = raw.indexOf("\"col\"", rowColon);
            int colColon = raw.indexOf(":", colIndex);
            int col = Integer.parseInt(
                    raw.substring(colColon + 1).trim().split("[^0-9]+")[0]
            );

            // Affichage de la paire
            System.out.println("row = " + row + ", col = " + col);

            // Continuer la lecture après "col"
            searchIndex = colColon + 1;
        }
    }
}
