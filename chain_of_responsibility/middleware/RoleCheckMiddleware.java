package chain_of_responsibility.middleware;

import java.util.Map;

public class RoleCheckMiddleware extends Middleware {
    public boolean check(Map<String, String> payment) {
        if (!payment.get("user").equals("admin@gmail.com")) {
            return false;
        }
        return checkNext(payment);
    }
}