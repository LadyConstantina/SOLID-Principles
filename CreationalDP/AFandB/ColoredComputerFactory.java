package Constantina.CreationalDP.AFandB;

public class ColoredComputerFactory implements ComputerDesignAbstractFactory {

    private String color1;
    private String color2;


    public ColoredComputerFactory(){
        this.color1 = "#023b4d";
        this.color2 = "#ED8B00";
    }

    public ColoredComputerFactory(String Background_Color, String Text_Color){
        this.color1 = Background_Color;
        this.color2 = Text_Color;
    }

    @Override
    public ComputerDesign CreateDesign() {
        return new ColoredComputer.ColoredComputerBuilder(color1,color2);
    }
}
