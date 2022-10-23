package Constantina.CreationalDP.AFandB;

public class main {
    public static void main (String[] args){
        ComputerDesign classic_computer = ComputerDesignFactory.getComputerDesign(new ClassicComputerFactory());
        ComputerDesign colored_computer = ComputerDesignFactory.getComputerDesign(new ColoredComputerFactory());
    }
}

