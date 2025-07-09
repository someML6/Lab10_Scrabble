import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleWordsList wordList = new SimpleWordsList();
        wordList.loadFromFile("src/SimpleWords.txt");

        System.out.println("Wörter geladen: " + wordList.size());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib ein Wort ein: ");
        String input = scanner.nextLine();

        if (wordList.contains(input)) {
            System.out.println("✅");
        } else {
            System.out.println("❌");
        }
    }
}