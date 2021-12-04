package observer;
public interface Bank {
    //add notif
    public void attach(KursObs observer);

    //delete notif
    public void detach(KursObs observer);


    // notif ke pople
    public void notifyUpdate(Informasi message);
}
