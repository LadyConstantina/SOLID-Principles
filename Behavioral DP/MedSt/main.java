package MedSt;

public class main {
    public static void main (String[] args){
        ChatMediator mediator = new GroupChat();
        User user1 = new Users(mediator,"Ana");
        User user2 = new Users(mediator,"Andrei");
        User user3 = new Users(mediator,"Alex");
        User user4 = new Users(mediator,"Vova");
        mediator.AddUser(user1);
        mediator.AddUser(user2);
        mediator.AddUser(user3);
        mediator.AddUser(user4);

        user1.SendMessage("Hi everyone!");
        System.out.println();
        user2.SendMessage("Hello!");
        System.out.println();
        user3.SendMessage("What's up?");
        System.out.println();
        user4.SendMessage("Sleeping, leave me alone!");
        mediator.RemoveUser(user4);
        System.out.println();
        user1.SendMessage("Vova is out!");
        System.out.println();
        user4.SendMessage("Hi!");
    }
}
