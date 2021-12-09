package observer;
public class Update1 implements KursObs{
//mengirimkan informasi ke kurs utama
    @Override
    public void update(Informasi m) {
        System.out.println("1 USD : 14.775 " + m.getMessageContent());
        
    }
    
}
