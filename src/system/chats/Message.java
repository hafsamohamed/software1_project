package system.chats;

import controller.chatscontroller.MessageManager;
import system.systemusers.Account;

import java.sql.Date;

public class Message {
    private String messageContent;
    private Date messageDate;
    private Account account;
    private MessageManager messageManager;

    Message(){}

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }
}
