package Constantina.LAB1.ExampleDependencyInversion.Before;

public class Main {
    public static void main(String[] args) {
        System.out.println("Square of length 3:");
        Figure square = new Figure(3);
        square.Print_Area();
    }
}
