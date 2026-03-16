public class uc5 {
    public class Main {
    public static void main(String[] args) {

        // Declare and initialize banner in single statement
        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", "W", "E", "L", "C", "O", "M", "E", "*"),
            String.join("", "*", " ", "T", "O", " ", "U", "C", "5", " ", "*"),
            String.join("", "*", " ", "B", "A", "N", "N", "E", "R", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
    
}
