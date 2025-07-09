import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleWordsList wordList = new SimpleWordsList();
        wordList.initFromFile("ScrabbleCheater-main/SimpleWords.txt");

        System.out.println("Wörter geladen: " + wordList.size());
        System.out.println(wordList.getNormalized("hka"));

        wordList.equals("bcda", "acdb");



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