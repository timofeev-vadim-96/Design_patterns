package event;

import event.observer.impl.Subscriber;
import event.publisher.impl.HHRU;

public class JobSearch {
    public static void main(String[] args) {
        HHRU hhru = new HHRU();
        Subscriber subscriber1 = new Subscriber("Alan Rickman");
        Subscriber subscriber2 = new Subscriber("John Wick");
        String vacancy1 = "Frontend developer";
        String vacancy2 = "Backend developer";
        hhru.add(subscriber1);
        hhru.add(subscriber2);
        hhru.addVacancy(vacancy1);
        hhru.addVacancy(vacancy2);
        hhru.removeVacancy(vacancy2);

    }
}
