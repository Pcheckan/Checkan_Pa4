import java.io.IOException;

public class Application {
    public static void main (String[] args) throws IOException {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        String readPath = "problem1.txt";
        String writePath = "unique_words.txt";
        duplicateRemover.remove(readPath);
        duplicateRemover.write(writePath);

    }
}
