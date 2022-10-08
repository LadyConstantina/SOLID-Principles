package Constantina.LAB1.ExampleDependencyInversion.After;

public class RectangleCalculations implements FigureCalculations {
    public int length;
    public int width;

    RectangleCalculations(){
        length = 1;
        width = 1;
    }
    RectangleCalculations(int len, int wid){
        length = len;
        width = wid;
    }
    public int Calculate_Area() {
        return length * width;
    }
}
