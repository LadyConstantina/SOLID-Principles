package Constantina.LAB1.ExampleDependencyInversion.Before;

public class Figure {
    int length;

    Figure() {
        length = 0;
    }

    Figure(int a){
        length = a;
    }
    private FigureCalculations figure = new FigureCalculations();
    public void Print_Area(){
        System.out.println("The area of your square is "+figure.Calculate_Area(length)+".");
    }
}

