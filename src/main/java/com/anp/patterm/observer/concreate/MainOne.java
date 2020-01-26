package com.anp.patterm.observer.concreate;

import com.anp.patterm.observer.base.Message;
import com.anp.pattern.observer.concreate.MessagePublisher;
import com.anp.pattern.observer.concreate.MessageSubscriberOne;
import com.anp.pattern.observer.concreate.MessageSubscriberThree;
import com.anp.pattern.observer.concreate.MessageSubscriberTwo;

public class MainOne {
    public static void main(String[] args) {
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();

        MessagePublisher p = new MessagePublisher();

        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update

        p.detach(s1);
        p.attach(s3);

        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}