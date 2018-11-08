

public class Bienenmajuskel {

    public static void main(String[] args) {
        
        boolean firstWord = true;
        
        String upperCase = "";
        String pascalCase = "";
        String startCase = "";
        String snakeCase = "";

        while (true) {
            // Nächstes Wort einlesen
            String next = Terminal.askString("Eingabe beenden mit leerem String: ");

            if (next.length() == 0) { // Keine Eingabe => Eingabe beendet => Ergebnis ausgeben
                System.out.println("Uppercase:  " + upperCase);
                System.out.println("Startcase:  " + startCase);
                System.out.println("PascalCase: " + pascalCase);
                System.out.println("Snake-Case: " + snakeCase);

                // Und das Program beenden, indem wir die main-Methode verlassen
                return;
            }
            else if (!isValidInput(next)) {
                System.out.println("Ignoriere ungültige Eingabe!");
            }
            else { // Wir haben eine gültige Eingabe

                // Jeden Buchstaben des neuen Worts lesen,
                // Entscheiden, ob er groß oder klein sein muss
                // und an die Ausgabestrings anhängen
                for (int i = 0; i < next.length(); i++) {
                    char c = next.charAt(i);

                    if (i == 0) {
                        if (firstWord)
                            startCase += upper(c); // Erster Buchstabe des ersten Worts => Groß
                        else {
                            startCase += lower(c); // Nicht das erste Wort => klein
                            snakeCase += "_"; // Anfang eines neuen Worts, das nicht das Erste ist, also Unterstrich
                        }
                        pascalCase += upper(c);
                    }
                    else {
                        pascalCase += lower(c);    // Klein, da nicht der Anfang eines Worts
                        startCase += lower(c);
                    }
                    snakeCase += lower(c); // Bei snake_case sind alle Buchstaben klein
                    upperCase += upper(c); // Bei UPPERCASE  sind alle Buchstaben groß
                }
                firstWord = false; // Jetzt hatten wir ein valides Wort, also ist das nächste nicht mehr das Erste
            }
        }
    }

    // Prüfe für jedes Zeichen in str, ob es ein Buchstabe ist
    private static boolean isValidInput(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c < 'A' || ('Z' < c && c < 'a') || 'z' < c) {
                return false;  // Kein Buchstabe => Eingabe invalide
            }
        }

        // Da wir kein falsches Zeichen gefunden haben ist die Eingabe valide
        return true;
    }

    // Stellt sicher, dass ein Buchstabe klein ist
    private static char lower(char c) {
        if ('A' <= c && c <= 'Z')
            return (char) (c + ('a' - 'A')); // Äquivalent zu 'return (char) (c + 32)'

        // Der Buchstabe ist schon klein
        return c;
    }

    // Stellt sicher, dass ein Buchstabe groß ist
    private static char upper(char c) {
        if ('a' <= c && c <= 'z')
            return (char) (c + ('A' - 'a')); // Äquivalent zu 'return (char) (c - 32)'

        // Der Buchstabe ist schon groß
        return c;
    }
}
