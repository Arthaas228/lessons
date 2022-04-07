package lesson8.ads;

import java.util.Date;

public class Message extends BaseEntity{
    String message;
    User userFrom;
    User userTo;
    Date dateSent;
    Date dateRead;

    public Message(String message, User userFrom, User userTo, long id ) {
        super(id);
        this.message = message;
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.dateSent = new Date();

    }
    void setDateRead(){
        dateRead = new Date();
    }
    boolean isRead(){
        return dateRead == null;

    }

}
