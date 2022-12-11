package MedSt;

public abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void SendMessage(String message);
    public abstract void ReceiveMessage(String message);
    public abstract void SetInactive();
}
