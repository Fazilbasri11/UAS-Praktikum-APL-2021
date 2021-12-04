package observer;
public class Update3 implements KursObs{
//mengirimkan informasi ke kurs utama
    @Override
    public void update(Informasi m) {
        System.out.println("HKD : 1.854,93 -> " + m.getMessageContent());
        
    }
    
}
