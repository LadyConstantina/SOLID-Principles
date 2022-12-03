package ComFly;

public class main {
    public static void main (String[] args){

        ChatFactory factory = new ChatFactory();


        OnlineChat chat1 = factory.getChat("Facebook");
        OnlineChat chat2 = factory.getChat("Instagram");
        OnlineChat chat3 = factory.getChat("LinkedIn");
        OnlineChat chat4 = factory.getChat("Facebook");

        Messaging messaging = new Messaging();
        System.out.println("Message 1:");
        messaging.AddChat(chat1);
        messaging.AddChat(chat2);
        messaging.SendMessage("Hi all!");
        System.out.println("Message 2:");
        messaging.AddChat(chat3);
        messaging.AddChat(chat4);
        messaging.SendMessage("I am Tina!");
        System.out.println("Message 3:");
        messaging.RemoveChat(chat1);
        messaging.SendMessage("Bye!");
        messaging.ClearGroup();

    }
}
