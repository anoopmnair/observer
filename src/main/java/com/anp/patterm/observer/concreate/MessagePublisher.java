package com.anp.pattern.observer.concreate;

import com.anp.patterm.observer.base.Message;
import com.anp.patterm.observer.base.Observer;
import com.anp.patterm.observer.base.Subject;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    private List<Observer> ObserverList=new ArrayList<>();

    @Override
    public void attach(Observer o) {
        ObserverList.add(o);
    }

    @Override
    public void detach(Observer o) {
        ObserverList.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for (Observer o:ObserverList
             ) {
            o.update(m);

        }
    }
}
