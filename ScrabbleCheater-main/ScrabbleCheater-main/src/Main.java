import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleWordsList wordList = new SimpleWordsList();
        Scanner input = new Scanner(System.in);
        wordList.initFromFile("ScrabbleCheater-main/ScrabbleCheater-main/SimpleWords.txt");


        /*/AUFGABE 2
        System.out.println(wordList.getNormalized("hka"));
        wordList.equals("bcda", "acdb");
        /*/

        /*/AUFGABE 3
        System.out.println("Ähnliche Wörter: " + wordList.validWordsUsingAllTiles("undh"));
        /*/

        // Aufgabe 6
        testword(input, wordList);
        testword(input, wordList);
        testword(input, wordList);
        //

    }

    public static void testword(Scanner input, SimpleWordsList wordList)
    {
        System.out.print("Input a Word to test: ");
        String testInp = input.nextLine();

        System.out.println("Ähnliche Wörter: " + wordList.validWordsUsingAllTiles(testInp));
    }
}