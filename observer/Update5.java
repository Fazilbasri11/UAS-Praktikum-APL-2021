package observer;
public class Update5 implements KursObs{

    @Override
    public void update(Informasi m) {
        System.out.println("AUD : 10.273 -> " + m.getMessageContent());
        
    }
    
}
