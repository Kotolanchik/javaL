package Pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Publisher {
    private final List<Subscriber> subscriberList = new ArrayList<>();
    private final List<String> newsList = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
        System.out.println("Этот человек начал получать газету " + subscriber.getName());
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
        System.out.println("Этот человек перестал получать газету " + subscriber.getName());
    }

    @Override
    public void notify(String text) {
        subscriberList.forEach(subscriber -> subscriber.notification(text));
    }

    public void createNews(String news) {
        newsList.add(news);
        notify(news);
    }
}
