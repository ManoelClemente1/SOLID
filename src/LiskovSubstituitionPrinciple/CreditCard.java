package LiskovSubstituitionPrinciple;

public class CreditCard extends Card{

    @Override
    public void validade() throws Exception {
        System.out.println("Validation Limit....");

        System.out.println("Card limit ok");
    }
}
