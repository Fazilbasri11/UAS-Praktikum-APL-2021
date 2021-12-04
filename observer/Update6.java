package observer;
public class Update6 implements KursObs{

    @Override
    public void update(Informasi m) {
        System.out.println("SGD : 10.575,93 -> " + m.getMessageContent());
        
    }
    
}
