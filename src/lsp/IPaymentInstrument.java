package lsp;

public interface IPaymentInstrument {

    void validade() throws Exception;
    void collectPayment();
}
