package observer;

import observer.postal.PostalOffice;
import observer.listeners.EmailNotificationListener;
import observer.listeners.LogNewItemsListener;

/**
 * Task: Паттерн Observer. 
 * Разработать систему Почтовое отделение. 
 * Из издательства в почтовое отделение поступают издаваемые газеты и журналы. 
 * Почтовое отделение отправляет полученные печатные издания соответствующим подписчикам.
 */

public class Main {
	public static void main(String[] args) {
        PostalOffice postalOffice = new PostalOffice();
        postalOffice.events.subscribe("new", new LogNewItemsListener("java"));
        postalOffice.events.subscribe("send", new EmailNotificationListener("test@example.com"));

        try {
            postalOffice.newMagazine("java");
            postalOffice.sendMagazine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}