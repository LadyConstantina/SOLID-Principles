package Constantina.CreationalDP.AFandB;

import javax.swing.*;
import java.awt.event.*;

public class ClassicComputer{

    private JFrame frame;
    private JButton button;
    private JTextField number1field;
    private JLabel number1label;
    private JTextField number2field;
    private JLabel number2label;
    private JTextField Result;
    private JTextField Error;

    private ClassicComputer(ClassicComputerBuilder builder){
        this.frame = builder.frame;
        this.button = builder.button;
        this.number1field = builder.number1field;
        this.number1label = builder.number1label;
        this.number2field = builder.number2field;
        this.number2label = builder.number2label;
        this.Error = builder.Error;
        this.Result = builder.Result;
    }

    public static class ClassicComputerBuilder extends ComputerDesign implements ActionListener {
        private JFrame frame;
        private JButton button;
        private JTextField number1field;
        private JLabel number1label;
        private JTextField number2field;
        private JLabel number2label;
        private JTextField Result;
        private JTextField Error;

        public ClassicComputerBuilder() {
            this.frame = Frame();
            this.button = Button("Divide");
            this.frame.add(button);
            this.number1field = Field(70, 75, 250, 25);
            this.frame.add(number1field);
            this.number2field = Field(70, 135, 250, 25);
            this.frame.add(number2field);
            this.number1label = Label("Write first number:", 70, 40, 1500, 40);
            this.frame.add(number1label);
            this.number2label = Label("Write second number:", 70, 105, 150, 30);
            this.frame.add(number2label);
            this.Result = Field(70, 230, 250, 35);
            this.Result.setText("Result: ");
            this.frame.add(Result);
            this.Error = Field(70, 270, 250, 35);
            this.Error.setText("Error: ");
            this.frame.add(Error);
            this.frame.setLayout(null);
            this.frame.setVisible(true);
            this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.frame.setResizable(false);
        }
        @Override
        public JFrame Frame(){
            JFrame f = new JFrame();
            f.setTitle("Calculator Classic");
            f.setSize(400, 500);
            return f;
        }

        @Override
        public JButton Button(String text) {
            JButton b = new JButton(text);
            b.setBounds(130, 180, 100, 40);
            b.addActionListener(this);
            return b;
        }

        @Override
        public JTextField Field(int x,int y, int width, int height) {
            JTextField field=new JTextField();
            field.setBounds(x,y,width,height);
            return field;
        }

        @Override
        public JLabel Label(String text, int x, int y,int width, int height) {
            JLabel label = new JLabel();
            label.setText(text);
            label.setBounds(x,y,width,height);
            return label;
        }

        public void actionPerformed(ActionEvent e)
        {
            try{
                String N1, N2;
                N1=number1field.getText();
                N2=number2field.getText();
                if (N1.isEmpty()) {throw new Exception("No Number 1 found!");}
                if (N2.isEmpty()) {throw new Exception("No Number 2 found!");}
                for (int i = 0; i < N1.length(); i++) {
                    if(".0123456789".indexOf(N1.charAt(i)) == -1){
                        throw new NumberFormatException("Don't use \',\' and letters!");
                    }
                }
                for (int i = 0; i < N2.length(); i++) {
                    if (".0123456789".indexOf(N2.charAt(i)) == -1) {
                        throw new NumberFormatException("Don't use \',\' and letters!");
                    }
                }
                double A=0,B=0;
                boolean point=false;
                double div=1.0;
                for (int i = 0; i < N1.length(); i++) {
                    if (".".indexOf(N1.charAt(i)) > -1 && !point){
                        point=true;
                        continue;
                    }else if(".".indexOf(N1.charAt(i)) > -1 && point){
                        throw new NumberFormatException("You can't have multiple \'.\' in a number");
                    }
                    if(!point){
                        A=A*10+(N1.charAt(i)-'0');
                    }else if (point){
                        div=div*10;
                        A=((N1.charAt(i)-'0')/div)+A;
                    }
                }
                point=false;
                div=1.0;
                for (int i = 0; i < N2.length(); i++) {
                    if (N2.charAt(i)=='.' && !point){
                        point=true;
                        continue;
                    }else if(".".indexOf(N2.charAt(i)) > -1 && point){
                        throw new NumberFormatException("You can't have 2 \'.\' in a number");
                    }
                    if(!point){
                        B=B*10+(N2.charAt(i)-'0');
                    }else{
                        div=div*10;
                        B=B+((N2.charAt(i)-'0')/div);
                    }
                }
                if (B==0) {throw new ArithmeticException("Division by 0 is impossible!");}
                double result=A/B;
                Error.setText("Error: None");
                Result.setText("Result: "+result);
            }catch (NumberFormatException e1){
                Error.setText("Error: "+e1);
                Result.setText("Result: ");
            }catch (ArithmeticException e2){
                Error.setText("Error: "+e2);
                Result.setText("Result: ");
            }catch (Exception e3){
                Error.setText("Error: "+e3);
                Result.setText("Result: ");
            }
        }
    }
}
