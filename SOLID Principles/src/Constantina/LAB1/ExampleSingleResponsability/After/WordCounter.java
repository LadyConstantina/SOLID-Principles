package Constantina.LAB1.ExampleSingleResponsability.After;

public class WordCounter{

    public int count(String Text) {
        int number_of_words = 0;
        for (int i = 1; i < Text.length(); i++) {
            if (Text.charAt(i) == ' ' & Text.charAt(i - 1) != ' ') {
                number_of_words++;
            }
        }
        //The case of last word not ending in space
        if (Text.endsWith(".")) {
            number_of_words++;
        }

        return number_of_words;
    }
}
