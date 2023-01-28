package lsp;

public class MainPayment {

    public static void main(String[] args) throws Exception {
//        CreditCard card = new CreditCard();
//        DebitCard card = new DebitCard();
        Rewards card = new Rewards();


        card.validade();
        card.collectPayment();

    }
}
