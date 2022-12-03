package ComFly;

public class Instagram implements OnlineChat{
    @Override
    public void SendMessage(String message){
        System.out.println("Me: "+message);
    }
}
