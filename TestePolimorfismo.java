public class TestePolimorfismo {
    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCredito("1111-2222-3333-4444");
        MetodoPagamento boleto = new Boleto("9999.8888.7777.6666");
        MetodoPagamento pix = new Pix("usuario@email.com");

        System.out.println("--- Teste 1: Pagamento com Cartão ---");
        ProcessadorPagamento.processar(cartao, 150.75);

        System.out.println("\n--- Teste 2: Pagamento com Boleto ---");
        ProcessadorPagamento.processar(boleto, 499.00);

        System.out.println("\n--- Teste 3: Pagamento com Pix ---");
        ProcessadorPagamento.processar(pix, 25.50);
    }
}