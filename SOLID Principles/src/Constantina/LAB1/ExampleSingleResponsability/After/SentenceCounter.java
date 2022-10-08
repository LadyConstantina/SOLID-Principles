package Constantina.LAB1.ExampleSingleResponsability.After;

public class SentenceCounter {

    public int count(String Text) {
        int number_of_sentences = 0;
        for (int i = 1; i < Text.length(); i++) {
            if (Text.charAt(i) == '.' | Text.charAt(i) == '!' | Text.charAt(i) == '?') {
                number_of_sentences++;
            }
        }
        return number_of_sentences;
    }

}
