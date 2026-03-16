import java.util.HashMap;
import java.util.Map;

public class uc7 {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Centralized Character Storage
        Map<Character, CharacterPatternMap> patternLibrary = new HashMap<>();

        patternLibrary.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternLibrary.put('P', new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternLibrary.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));

        String word = "OOPS";
        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        // Build banner dynamically
        for (char c : word.toCharArray()) {
            CharacterPatternMap cp = patternLibrary.get(c);

            if (cp != null) {
                String[] pattern = cp.getPattern();

                for (int i = 0; i < 7; i++) {
                    banner[i].append(pattern[i]).append("  ");
                }
            }
        }

        // Display banner
        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }
}
