package Constantina.LAB1.ExampleDependencyInversion.After;

public class SquareCalculations implements FigureCalculations {
    public int length;
    SquareCalculations(){
        length = 1;
    }
    SquareCalculations(int a){
        length = a;
    }
    public int Calculate_Area() {
        return length*length;
    }
}
