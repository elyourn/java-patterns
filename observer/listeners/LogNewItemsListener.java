package observer.listeners;

public class LogNewItemsListener implements EventListener {
    private String itemName;

    public LogNewItemsListener(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void update(String eventType, String magazine) {
        System.out.println("Postal office has new item: "+ itemName);
    }
}
