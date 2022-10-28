package com.example.administrator.blueinteract;

import java.util.Date;

/**
 * Created by ufours18 on 3/20/2017.
 */

public class ChatMessage {
    public boolean left;
    public String message;
    public String messageUser;
    public long messageTime;

    public ChatMessage(boolean left, String message) {
        super();
        this.left = left;
        this.message = message;
    }

    public ChatMessage(String messageUser) {
        super();

        this.messageUser = messageUser;


        messageTime = new Date().getTime();
    }


    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}

