package observer;
public class Update2 implements KursObs{

    @Override
    public void update(Informasi m) {
        System.out.println("EUR : 16.363 -> " + m.getMessageContent());      
    }   
}
