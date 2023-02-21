import java.util.ArrayList;
import java.util.List;

public class WordsChecker {
    String textForCheck;

    public WordsChecker(String textForCheck) {
        this.textForCheck = textForCheck;
    }

    protected boolean hasWord(String word) {
        ArrayList<String> list = new ArrayList<>(List.of(textForCheck.split("\\P{IsAlphabetic}+")));
        for (String s : list) {
            if (s.equals(word)) {
                System.out.println("Слово " + "'" + word + "'" + " есть в этом тексте!");
                return true;
            }
        }
        System.out.println("Слово " + "'" + word + "'" + " есть в этом тексте!");
        return false;
    }
}
