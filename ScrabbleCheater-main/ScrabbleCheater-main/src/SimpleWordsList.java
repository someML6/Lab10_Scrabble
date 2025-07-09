import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class SimpleWordsList {

    private Set<String> words = new HashSet<>();

    public void loadFromFile(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                words.add(line.trim().toLowerCase());
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }
    }

    public int size() {
        return words.size();
    }

    public boolean contains(String word) {
        return words.contains(word.toLowerCase());
    }

    public Set<String> getWords() {
        return words;
    }
}