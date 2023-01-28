package LiskovSubstituitionPrinciple;

abstract public class Card implements IPaymentInstrument {

    @Override
    public void validade() throws Exception {

    }

    @Override
    public void collectPayment() {
        System.out.println("Payment realized");
    }
}
