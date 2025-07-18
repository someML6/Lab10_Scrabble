import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class SimpleWordsList {

    private Set<String> words = new HashSet<>();

    public void initFromFile(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                words.add(line.trim().toLowerCase());
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }
    }

    public String getNormalized(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public void equals(String perm1, String perm2){
        String sortedPerm1 = this.getNormalized(perm1);
        String sortedPerm2 = this.getNormalized(perm2);

        if (sortedPerm1.equals(sortedPerm2)){
            System.out.println("Permutation");
        }
    }

    public Set<String> validWordsUsingAllTiles(String input){
        String sortedInput = this.getNormalized(input.toLowerCase());
        Set<String> permutations = new HashSet<>();

        for(String word : words){
            String sortedWord = this.getNormalized(word);

            if(sortedWord.equals(sortedInput)){
                permutations.add(word);
            }
        }
        return permutations;
    }

    // Map für Wörter nach sortierten Buchstaben
    Map<String, List<String>> wordMap = new HashMap<>();

    public void initFromFile2(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String word;
        while ((word = reader.readLine()) != null) {
            String key = normalize(word);
            wordMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        reader.close();
    }

    public Set<String> validWordsUsingAllTiles2(String tileRack) {
        String key = normalize(tileRack);
        return new HashSet<>(wordMap.getOrDefault(key, new ArrayList<>()));
    }

    public String normalize2(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    @Override
    public boolean equals2(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Permutation)) return false;
        Permutation other = (Permutation) obj;
        return this.getNormalized().equals(other.getNormalized());
    }

    @Override
    public int hashCode2() {
        return this.getNormalized().hashCode();
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