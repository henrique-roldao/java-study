public class TesteReferencia {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta " + segundaConta.getSaldo());

        System.out.println("saldo da segunda conta " + segundaConta.getSaldo());

        System.out.println("saldo da primeira conta " + primeiraConta.getSaldo());

        if(primeiraConta == segundaConta) {
            System.out.println("Sim são a mesma conta, pois são referências");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
