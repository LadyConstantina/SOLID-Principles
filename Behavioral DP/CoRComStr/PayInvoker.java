package CoRComStr;

public class PayInvoker {

    public Command command;

    public PayInvoker(Command c){
        this.command = c;
    }

    public void execute(){
        this.command.execute();
    }
}
