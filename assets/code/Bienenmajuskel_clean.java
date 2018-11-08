
public class Bienenmajuskel_clean {

    public static void main(String[] args) {
        boolean firstWord = true;
        String upperCase = "";
        String startCase = "";
        String snakeCase = "";
        String camelCase = "";
        
        while (true) {
            String eingabe = Terminal.askString("Mach eine Eingabe: ");
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
                    // Like pascal case but only on the first word
                    startCase += Character.toUpperCase(eingabe.charAt(0)) + eingabe.substring(1).toLowerCase();
                }
                else {
                    startCase += eingabe.toLowerCase();
                    snakeCase += "_";
                }

                upperCase += eingabe.toUpperCase();
                snakeCase += eingabe.toLowerCase();

                // Take first letter and upperCase it, take rest of string and lowerCase it
                camelCase += Character.toUpperCase(eingabe.charAt(0)) + eingabe.substring(1).toLowerCase();

                // we already got a word, so the next can't be the first
                // note: we only set this if we got a VALID word!
                firstWord = false;
            }
        }
    }

    static boolean isValid(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (!Character.isLetter(c))
                return false;  // not a letter => whole string is invalid
        }
        return true;  // no invalid letter => string is valid
    }
}
