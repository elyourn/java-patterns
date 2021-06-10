package chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

import chain_of_responsibility.middleware.PaymentValidationMiddleware;
import chain_of_responsibility.middleware.RoleCheckMiddleware;
import chain_of_responsibility.middleware.ComissionMiddleware;
import chain_of_responsibility.middleware.Middleware;

/**
 * Task: Паттерн Chain of responsibility.
 * Прохождение платежа через банковскую систему сопровождается целым рядом действий: 
 * фиксирующих, контролирующих, снимающих процент банка и прочие вычеты и действия. 
 * Построить цепочки для различного вида платежей (обычных, льготных, государственных, внутрибанковских) 
 * в соответствии с предметной областью и разработать модель системы.
 */

public class Main {
	public static void main(String[] args) {
        Map<String, String> payment = new HashMap<String, String>();

        payment.put("type", "common");
        payment.put("user", "admin@gmail.com");
        payment.put("value", "10000");

        Middleware middleware = new PaymentValidationMiddleware();
        middleware.linkWith(new RoleCheckMiddleware())
                .linkWith(new ComissionMiddleware());

        // Сервер получает цепочку от клиентского кода.
        if(middleware.check(payment)) {
            System.out.println("Transaction have been send. \n");
        } else {
            System.out.println("Transaction is bronken. Please try again. \n");
        }
    }
}