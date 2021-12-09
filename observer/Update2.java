package observer;
public class Update2 implements KursObs{
//mengirimkan informasi ke kurs utama
    @Override
    public void update(Informasi m) {
        System.out.println("1 EUR : 16.363 " + m.getMessageContent());      
    }   
}
