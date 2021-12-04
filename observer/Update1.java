package observer;
public class Update1 implements KursObs{

    @Override
    public void update(Informasi m) {
        System.out.println("USD : 14.775 -> " + m.getMessageContent());
        
    }
    
}
