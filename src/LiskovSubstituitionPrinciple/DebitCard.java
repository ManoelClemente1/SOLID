package LiskovSubstituitionPrinciple;

public class DebitCard extends Card {

    @Override
    public void validade() throws Exception {
        System.out.println("Verifying money......");

        System.out.println("Money verified!");
    }
}
