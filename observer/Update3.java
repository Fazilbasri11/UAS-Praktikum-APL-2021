package observer;
public class Update3 implements KursObs{

    @Override
    public void update(Informasi m) {
        System.out.println("HKD : 1.854,93 -> " + m.getMessageContent());
        
    }
    
}
