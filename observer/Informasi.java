package observer;
//class yang berfungsi untuk membuat pesan/notif
public class Informasi{
    private String messageContent;

    public Informasi(String message){
        this.messageContent=message;
    }

    public String getMessageContent(){
        return this.messageContent;
    }

    
}