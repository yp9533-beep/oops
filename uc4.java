public class uc4 {

    public static void main(String[] args) {

        // Step 1: Create banner using String array
        String[] banner = {
                String.join("", "***************"),
                String.join("", "*             *"),
                String.join("", "*   WELCOME   *"),
                String.join("", "*      TO     *"),
                String.join("", "*    UC4 DEMO *"),
                String.join("", "*             *"),
                String.join("", "***************")
        };

        // Step 2: Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
    

