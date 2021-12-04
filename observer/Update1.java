package observer;
public class Update1 implements KursObs{
//mengirimkan informasi ke kurs utama
    @Override
    public void update(Informasi m) {
        System.out.println("USD : 14.775 -> " + m.getMessageContent());
        
    }
    
}
