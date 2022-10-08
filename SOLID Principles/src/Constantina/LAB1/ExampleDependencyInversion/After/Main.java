package Constantina.LAB1.ExampleDependencyInversion.After;

public class Main {
    public static void main(String[] args) {
        System.out.println("Square of length 3:");
        Figure square = new Figure();
        square.figure = new SquareCalculations(3);
        square.Print_Area();

        System.out.println("Rectangle of length 3, width 4:");
        Figure rectangle = new Figure();
        rectangle.figure = new RectangleCalculations(3,4);
        rectangle.Print_Area();
    }
}
