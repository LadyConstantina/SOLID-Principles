package Constantina.CreationalDP.AFandB;

public class ComputerDesignFactory {
    public static ComputerDesign getComputerDesign(ComputerDesignAbstractFactory factory){
        return factory.CreateDesign();
    }
}
