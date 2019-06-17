import java.util.ArrayList;
import java.util.List;

public class NaiveCompressor implements Compressor {

    @Override
    public String compress(String text) {
        String [] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
        }

        return String.join("", words);
    }

    @Override
    public String decompress(String text) {
       char [] letters = text.toCharArray();
        List <String >  words = new ArrayList<>();
       StringBuilder actualWord = new StringBuilder();
       for (char letter : letters) {
           if (Character.isUpperCase(letter) &&  actualWord.length()>0) {
               words.add(actualWord.toString());
               actualWord = new StringBuilder() ;
           }
           actualWord.append(letter);
       }
       words.add(actualWord.toString());
       return String.join(" ", words);

    }
}