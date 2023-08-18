package Pattern.observer;

public class Reader implements Subscriber {
    private final String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void notification(String text) {
        System.out.println(name + " получил новую газету " + text);
    }

    @Override
    public String getName() {
        return name;
    }
}
