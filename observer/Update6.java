package observer;
public class Update6 implements KursObs{
//mengirimkan informasi ke kurs utama
    @Override
    public void update(Informasi m) {
        System.out.println("SGD : 10.575,93 -> " + m.getMessageContent());
        
    }
    
}
