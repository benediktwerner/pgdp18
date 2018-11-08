
public class Bienenmajuskel_live {

    public static void main(String[] args) {
        boolean firstWord = true;
        String upperCase = "";
        String startCase = "";
        String snakeCase = "";
        String camelCase = "";
        
        while (true) {
            String eingabe = Terminal.askString("Mach eine eingabe: ");
            if (eingabe.length() == 0) {
                System.out.println(upperCase);
                System.out.println(startCase);
                System.out.println(snakeCase);
                System.out.println(camelCase);
                return;
            }
            else if (!isValid(eingabe)) {
                System.out.println("Invalide Eingabe => wird ignoriert");
            }
            else {
                if (firstWord) {
                    startCase += charToUpper(eingabe.charAt(0)); // startcase: first letter of word word => upper
                    for (int i = 1; i < eingabe.length(); i++) { // other letters lower (we start at index 1 to skip the first letter)
                        char c = eingabe.charAt(i);

                        startCase += charToLower(c);
                    }
                }
                else {
                    startCase += toLower(eingabe); // startcase: not first word => lower
                    snakeCase += "_";
                }

                upperCase += toUpper(eingabe);
                snakeCase += toLower(eingabe);

                // camel case
                camelCase += charToUpper(eingabe.charAt(0));
                for (int i = 1; i < eingabe.length(); i++) {
                    char c = eingabe.charAt(i);

                    camelCase += charToLower(c);
                }

                // we already got a word, so the next can't be the first
                // note: we only set this if we got a VALID word!
                firstWord = false;
            }
        }
    }

    /**
      * uppercase a string
      */
    static String toUpper(String eingabe) {
        String ausgabe = "";
        for (int i = 0; i < eingabe.length(); i++) {
            char c = eingabe.charAt(i);

            ausgabe += charToUpper(c);
        }
        return ausgabe;
    }

    /**
      * lowercase a string
      */
    static String toLower(String eingabe) {
        String ausgabe = "";
        for (int i = 0; i < eingabe.length(); i++) {
            char c = eingabe.charAt(i);

            ausgabe += charToLower(c);
        }
        return ausgabe;
    }

    static char charToUpper(char c) {
        if ('A' <= c && c <= 'Z') {
            return c;
        }
        return (char) (c + 'A' - 'a');
    }

    static char charToLower(char c) {
        if ('a' <= c && c <= 'z') {
            return c;
        }
        return (char) (c + ('a' - 'A'));
    }

    static boolean isValid(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c < 'A')
                return false;
            if ('Z' < c && c < 'a')
                return false;
            if ('z' < c)
                return false;
        }
        return true;
    }
}
