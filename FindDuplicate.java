public class DuplicateCharFinder {
    public static void main(String[] args) {
        String input = "hello world";

        System.out.print("Duplicate characters: ");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            for (int j = i + 1; j < input.length(); j++) {
                if (c == input.charAt(j)) {
                    System.out.print(c + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}