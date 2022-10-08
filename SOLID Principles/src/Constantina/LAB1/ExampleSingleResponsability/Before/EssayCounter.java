package Constantina.LAB1.ExampleSingleResponsability.Before;

public class EssayCounter {
    String Text;

    EssayCounter(){
        Text="";
    }

    EssayCounter(String string) {
        Text=string;
    }

    private int count_words(){
        int number_of_words=0;
        for (int i = 1; i < Text.length(); i++) {
            if (Text.charAt(i) == ' ' & Text.charAt(i-1)!=' ') {
                number_of_words++;
            }
        }

        if (Text.endsWith(".")) {number_of_words++;}

        return number_of_words;
    }

    private int count_sentences(){
        int number_of_sentences=0;
        for (int i = 1; i < Text.length(); i++) {
            if(Text.charAt(i)=='.' | Text.charAt(i)=='!' | Text.charAt(i)=='?'){
                number_of_sentences++;
            }
        }
        return number_of_sentences;
    }

    public void Print_Details(){
        System.out.println("The essay has "+count_sentences()+" sentences and "+count_words()+" words!");
    }

}
