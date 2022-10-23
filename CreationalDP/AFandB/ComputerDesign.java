package Constantina.CreationalDP.AFandB;

import javax.swing.*;

public abstract class ComputerDesign {

    public abstract JFrame Frame();
    public abstract JButton Button(String text);
    public abstract JTextField Field(int x,int y, int width, int height);
    public abstract JLabel Label(String text, int x, int y,int width, int height);

}
