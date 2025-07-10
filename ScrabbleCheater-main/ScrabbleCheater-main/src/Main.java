import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleWordsList wordList = new SimpleWordsList();
        wordList.initFromFile("ScrabbleCheater-main/SimpleWords.txt");

        //AUFGABE 2
        System.out.println(wordList.getNormalized("hka"));
        wordList.equals("bcda", "acdb");

        //AUFGABE 3
        System.out.print("Ähnliche Wörter: " + wordList.validWordsUsingAllTiles("undh"));
    }
}