package MedSt;

public interface ChatMediator {

    public void SendMessage(String message, User from);
    public void AddUser(User user);
    public void RemoveUser(User user);
}
