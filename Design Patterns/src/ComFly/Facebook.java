package ComFly;

public class Facebook implements OnlineChat{

    @Override
    public void SendMessage(String message){
        System.out.println("Me: "+message);
    }
}
