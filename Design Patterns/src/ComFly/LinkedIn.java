package ComFly;

public class LinkedIn implements OnlineChat{

    @Override
    public void SendMessage(String message){
        System.out.println("Me: "+message);
    }
}
