package lesson8.ads;

import java.util.Date;

public class Message extends BaseEntity{
    String message;
    User userFrom;
    User userTo;
    Date dateSent;
    Date dateRead;

    public Message(long id, User userFrom, User userTo, String message) {
        super(id);
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.dateSent = new Date();
        this.message = message;

    }
    void setDateRead(){
        dateRead = new Date();
    }
    boolean isRead(){
        return dateRead == null;

    }

}