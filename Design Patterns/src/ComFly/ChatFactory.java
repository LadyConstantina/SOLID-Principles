package ComFly;

import java.util.HashMap;

public class ChatFactory {

    private static final HashMap<String,OnlineChat> chats = new HashMap<String,OnlineChat>();

    public static OnlineChat getChat(String type){
        OnlineChat chat = chats.get(type);

        if (chat == null){
            if (type.equals("Facebook")){
                chat = new Facebook();
            }else if(type.equals("Instagram")){
                chat = new Instagram();
            }else if (type.equals("LinkedIn")){
                chat = new LinkedIn();
            }
            chats.put(type,chat);
        }
        return chat;
    }
}
