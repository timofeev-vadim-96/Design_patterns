package event.publisher;

import event.observer.Observer;

import java.util.List;

public interface Publisher { //site HH.ru
    void add (Observer observer); // add subscriber
    void remove (Observer observer); // remove subscriber
    void notify (List<Observer> observers);  // notify all subscribers
}
