package Constantina.LAB1.ExampleSingleResponsability.After;

public class EssayCounter {
    String Text;

    EssayCounter(){
        Text="";
    }

    EssayCounter(String string) {
        Text=string;
    }

    private SentenceCounter sentences = new SentenceCounter();
    private WordCounter words = new WordCounter();

    public void Print_details(){
        System.out.println("The essay has "+sentences.count(Text)+" sentences and "+words.count(Text)+" words!");
    }

}

