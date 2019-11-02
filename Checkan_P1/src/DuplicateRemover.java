import java.io.*;
import java.util.HashSet;

public class DuplicateRemover
{
    public static HashSet<String> uniqueWords = new HashSet<String>();

    public static void remove (String dataFile) throws IOException
    {
        // Making a reader and a writer
        PrintWriter writer = new PrintWriter("unique_words.txt");
        BufferedReader read = new BufferedReader(new FileReader(dataFile));
        String word = read.readLine();
        // Loop through the document word by word checking for any duplicates
        while (word != null)
        {
            if (uniqueWords.add(word))
                writer.println(word);
            word = read.readLine();
        }
        writer.flush();
        writer.close();
        read.close();
    }
    public static void write (String outputFile) throws IOException
    {
        PrintWriter writer = new PrintWriter(outputFile);
        String wordList = String.join(" ", uniqueWords);
        writer.write(wordList);
        writer.flush();
        writer.close();
    }
}
