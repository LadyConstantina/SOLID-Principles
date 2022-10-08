package Constantina.LAB1.ExampleDependencyInversion.After;

public class Figure {
    public FigureCalculations figure;
    public void Print_Area(){
        System.out.println("The area is "+figure.Calculate_Area()+".");
    }
}

