package MedSt;

import java.util.ArrayList;
import java.util.List;

public class GroupChat implements ChatMediator{

    private List<User> users;

    public GroupChat(){
        this.users=new ArrayList<>();
    }

    @Override
    public void SendMessage(String message, User from) {
        for (User u : this.users){
            if ( u != from){
                u.ReceiveMessage(message);
            }
        }
    }

    @Override
    public void AddUser(User user) {
        this.users.add(user);
    }

    @Override
    public void RemoveUser(User user) {
        this.users.remove(user);
        user.SetInactive();
    }
}
