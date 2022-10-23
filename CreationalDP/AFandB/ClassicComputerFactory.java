package Constantina.CreationalDP.AFandB;

public class ClassicComputerFactory implements ComputerDesignAbstractFactory {

    @Override
    public ComputerDesign CreateDesign() {
        return new ClassicComputer.ClassicComputerBuilder();
    }
}
