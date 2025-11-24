public class Boleto implements MetodoPagamento {
    private String codigoBarra;

    public Boleto(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Boleto. Boleto gerado e enviado por e-mail.");
    }
}