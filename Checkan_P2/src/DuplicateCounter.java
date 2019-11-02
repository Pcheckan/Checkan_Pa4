import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {
    Map<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count (String dataFile) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(dataFile));
        String word = reader.readLine();

        while (word != null)
        {
            if(wordCounter.containsKey(word))
            {
                int count = wordCounter.get(word);
                wordCounter.put(word, ++count);
            }
            else
            {
                wordCounter.put(word, 1);
            }
            word = reader.readLine();
        }
        reader.close();
    }

    public void write(String dataFile) throws IOException
    {
        PrintWriter wordWriter = new PrintWriter("unique_words_counts.txt");
        for (Map.Entry<String, Integer> word : wordCounter.entrySet())
        {
            wordWriter.write(word.getKey() + " " + word.getValue());
            wordWriter.write("\n");
        }
        wordWriter.flush();
        wordWriter.close();
    }
}
