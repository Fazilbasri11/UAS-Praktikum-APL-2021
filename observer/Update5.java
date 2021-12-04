package observer;
public class Update5 implements KursObs{
//mengirimkan informasi ke kurs utama
    @Override
    public void update(Informasi m) {
        System.out.println("AUD : 10.273 -> " + m.getMessageContent());
        
    }
    
}
