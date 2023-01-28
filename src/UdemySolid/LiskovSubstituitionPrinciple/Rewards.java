package UdemySolid.LiskovSubstituitionPrinciple;

public class Rewards implements IPaymentInstrument {


    @Override
    public void validade() throws Exception {
        System.out.println("Validatation rewards ok!");
    }

    @Override
    public void collectPayment() {
        System.out.println("Payment with success");
        System.out.println("Rewards ok");
    }
}
