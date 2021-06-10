package observer.listeners;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String magazine) {
        System.out.println("Magazine: " + magazine+ " have been send " + email + "");
    }
}

