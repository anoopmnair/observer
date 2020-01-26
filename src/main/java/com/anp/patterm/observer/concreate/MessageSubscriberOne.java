package com.anp.pattern.observer.concreate;

import com.anp.patterm.observer.base.Message;
import com.anp.patterm.observer.base.Observer;

public class MessageSubscriberOne implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne got the message");
    }
}
