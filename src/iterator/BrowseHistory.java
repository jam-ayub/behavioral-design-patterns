package iterator;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count = 0;

    public void push(String url) {
        urls[count] = url;
        count++;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
        return new Arrayterator(this);
    }

    public class Arrayterator implements Iterator {

        private final BrowseHistory history;
        private int index;

        public Arrayterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
