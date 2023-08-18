package Pattern.observer;

public interface Subscriber {
    void notification(String text);
    String getName();
}
