package controller.chatscontroller;

import controller.accountmanager.AccountController;
import system.chats.Message;

import java.util.Vector;

public class MessageManager {
    private Vector<Message> messages;
    private AccountController accountController ;

    MessageManager(){}
    public boolean sendMessage(Message m){
        return true;
    }
    public boolean receiveMessage(Message m){
        return true;
    }
}
