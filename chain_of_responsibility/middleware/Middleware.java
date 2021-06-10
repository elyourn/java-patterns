package chain_of_responsibility.middleware;

import java.util.Map;

public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(Map<String, String> payment);

    protected boolean checkNext(Map<String, String> payment) {
        if (next == null) {
            return true;
        }
        return next.check(payment);
    }
}