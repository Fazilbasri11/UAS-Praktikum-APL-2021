package observer;
import java.util.ArrayList;
import java.util.List;

public class ConcrateBank implements Bank {
    
    //penampung
    private List<KursObs> observers = new ArrayList<>();
    @Override
    public void attach(KursObs observer) {
        observers.add(observer);
        
    }

    @Override
    public void detach(KursObs observer) {
        observers.remove(observer);
        
    }

    @Override
    public void notifyUpdate(Informasi message) {
        for (KursObs observer : observers){
            observer.update(message);
        }
        
    }
    
}
