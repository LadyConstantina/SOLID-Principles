package MedSt;

public class Users extends User {

    protected State state;

    public Users(ChatMediator mediator, String name){
        super(mediator,name);
        this.state = new Active();
    }

    @Override
    public void SendMessage(String message) {
        if (this.state.Act()) {
            System.out.println(name + ": " + message);
            mediator.SendMessage(message, this);
        }else{
            System.out.println("Error:");
            System.out.println(name+" can't send messages! The user was kicked off the chat!");
        }
    }

    @Override
    public void ReceiveMessage(String message) {
        System.out.println(name+" received message.");
    }

    public void SetInactive(){
        this.state = new Inactive();
    }
}
