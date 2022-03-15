public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(50);

        System.out.println(contaDoPaulo.getSaldo());

        contaDoPaulo.saca(30);
        System.out.println(contaDoPaulo.getSaldo());

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(300, contaDoPaulo)) {
            System.out.println("Trasnferência feita com sucesso!");
        } else {
            System.out.println("Faltou dinheiro!");
        }

        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(contaDoPaulo.getSaldo());
    }
}
