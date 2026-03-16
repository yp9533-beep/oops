public class uc6 {

    public static void main(String[] args) {

        // Get character patterns
        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Final banner array (7 lines)
        String[] banner = new String[7];

        // Combine row by row
        for (int i = 0; i < 7; i++) {
            banner[i] = o[i] + "  " + p[i] + "  " + s[i];
        }

        // Render banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper method for P
    public static String[] buildP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Helper method for S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}