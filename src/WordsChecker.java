import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String textForCheck;
    private Set<String> textSet;

    public WordsChecker(String textForCheck) {
        this.textForCheck = textForCheck;
        this.textSet = new HashSet<>(List.of(textForCheck.split("\\P{IsAlphabetic}+")));
    }

    protected boolean hasWord(String word) {
            if (textSet.contains(word)) {
                System.out.println("Слово " + "'" + word + "'" + " есть в этом тексте!");
                return true;
        }
        System.out.println("Слово " + "'" + word + "'" + " НЕТ в этом тексте!");
        return false;
    }
}
