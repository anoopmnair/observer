package com.anp.pattern.observer.concreate;

import com.anp.patterm.observer.base.Message;
import com.anp.patterm.observer.base.Observer;

public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo got the message");
    }
}
