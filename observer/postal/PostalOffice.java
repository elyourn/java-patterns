package observer.postal;

import observer.publisher.EventManager;

/**
 * Task: Паттерн Observer. 
 * Разработать систему Почтовое отделение. 
 * Из издательства в почтовое отделение поступают издаваемые газеты и журналы. 
 * Почтовое отделение отправляет полученные печатные издания соответствующим подписчикам.
 */


public class PostalOffice {
    public EventManager events;
    private String magazine;

    public PostalOffice() {
        this.events = new EventManager("new", "send");
    }

    public void newMagazine(String itemName) {
        this.magazine = itemName;
        events.notify("new", magazine);
    }

    public void sendMagazine() {
        events.notify("send", magazine);
    }
}