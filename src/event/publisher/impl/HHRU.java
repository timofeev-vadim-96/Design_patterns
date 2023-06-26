package event.publisher.impl;

import event.observer.Observer;
import event.publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

public class HHRU implements Publisher {
    private final List<Observer> subscribers;
    private final List<String> vacancies;

    public HHRU() {
        this.subscribers = new ArrayList<>();
        this.vacancies = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notify(List<Observer> observers) {
        for (Observer subscriber: observers) {
            subscriber.handleEvent(vacancies);
        }
    }

    public void addVacancy(String vacancy){
        vacancies.add(vacancy);
        this.notify(this.subscribers);
    }

    public void removeVacancy(String vacancyToRemove){
        vacancies.remove(vacancyToRemove);
        this.notify(this.subscribers);
    }
}
