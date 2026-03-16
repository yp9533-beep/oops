import java.util.HashMap;
import java.util.Map;

public class uc8 {

    // Centralized Pattern Library
    private static final Map<Character, String[]> PATTERN_MAP = new HashMap<>();

    // Static block to initialize patterns
    static {
        PATTERN_MAP.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *" ,
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        PATTERN_MAP.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        PATTERN_MAP.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
    }

    public static void main(String[] args) {

        String word = "OOPS";

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = PATTERN_MAP.get(ch);

            if (pattern != null) {
                for (int row = 0; row < 7; row++) {
                    banner[row].append(pattern[row]).append("  ");
                }
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }
}
