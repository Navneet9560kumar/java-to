import java.nio.file.Files;
import java.nio.file.Paths;

public class PlagiarismChecker {
    private String sourceText;
    private String testText;

    public PlagiarismChecker(String sourceFile, String testFile) {
        try {
            this.sourceText = new String(Files.readAllBytes(Paths.get(sourceFile)));
            this.testText = new String(Files.readAllBytes(Paths.get(testFile)));
        } catch (Exception e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }

    public double checkPlagiarism() {
        int totalMatches = 0;
        int totalLength = testText.length();

        KMPAlgorithm kmp = new KMPAlgorithm();
        RabinKarpAlgorithm rabinKarp = new RabinKarpAlgorithm();
        BoyerMooreAlgorithm boyerMoore = new BoyerMooreAlgorithm();

        String[] testSentences = testText.split("\\.");

        for (String sentence : testSentences) {
            sentence = sentence.trim();
            if (sentence.isEmpty()) continue;

            if (kmp.search(sourceText, sentence) ||
                rabinKarp.search(sourceText, sentence) ||
                boyerMoore.search(sourceText, sentence)) {
                totalMatches += sentence.length();
            }
        }

        return ((double) totalMatches / totalLength) * 100;
    }
}
