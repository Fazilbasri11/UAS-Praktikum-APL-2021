package observer;
public class Update4 implements KursObs{

    @Override
    public void update(Informasi m) {
        System.out.println("JPY : 12.768,30 -> " + m.getMessageContent());
        
    }
    
}
