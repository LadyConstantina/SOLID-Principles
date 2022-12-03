package ComFly;

import java.util.ArrayList;
import java.util.List;

public class Messaging implements OnlineChat{

    private List<OnlineChat> group = new ArrayList<OnlineChat>();

    @Override
    public void SendMessage(String message){
        for (OnlineChat chat : group){
            System.out.println("Through "+chat.getClass().getSimpleName());
            chat.SendMessage(message);
        }
    }

    public void AddChat(OnlineChat chat){
        this.group.add(chat);
    }

    public void RemoveChat(OnlineChat chat){
        this.group.remove(chat);
    }

    public void ClearGroup(){
        this.group.clear();
        System.out.println("Group chat clear!");
    }

}
