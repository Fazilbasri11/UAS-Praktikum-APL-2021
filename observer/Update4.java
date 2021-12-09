package observer;
public class Update4 implements KursObs{
//mengirimkan informasi ke kurs utama
    @Override
    public void update(Informasi m) {
        System.out.println("1 JPY : 12.768,30 " + m.getMessageContent());
        
    }
    
}
