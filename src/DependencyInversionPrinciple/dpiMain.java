package DependencyInversionPrinciple;

import DependencyInversionPrinciple.payment.Payment;

public class dpiMain {

    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay("250");

    }
}
