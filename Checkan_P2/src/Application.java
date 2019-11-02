import java.io.IOException;

public class Application {
    public static void main (String[] args) throws IOException {
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        String readPath = "problem2.txt";
        String writePath = "unique_word_counts.txt";
        duplicateCounter.count(readPath);
        duplicateCounter.write(writePath);

    }
}
