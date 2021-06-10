package chain_of_responsibility.middleware;

import java.util.Map;

public class PaymentValidationMiddleware extends Middleware {
   public boolean check(Map<String, String> payment) {
        if (payment.get("type") != "common") {
            return false;
        }

        return checkNext(payment);
   }
}