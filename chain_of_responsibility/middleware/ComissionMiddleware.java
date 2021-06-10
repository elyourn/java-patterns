package chain_of_responsibility.middleware;

import java.util.Map;

public class ComissionMiddleware extends Middleware {
   public boolean check(Map<String, String> payment) {
        System.out.println("ComissionMiddleware: Bank get a 5% commission \n");

        return checkNext(payment);
   }
}