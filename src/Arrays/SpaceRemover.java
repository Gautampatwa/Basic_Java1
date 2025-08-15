package Arrays;
public class SpaceRemover {

    public static String removeSpacesManual(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Using StringBuilder for efficient string building
        StringBuilder resultBuilder = new StringBuilder();
        input=input.trim();

        return input.toString();
    }

    public static void main(String[] args) {
        String originalString = "Hello   World  Java  ";
        String noSpacesString = removeSpacesManual(originalString);
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("String without spaces: \"" + noSpacesString + "\"");
    }
}
