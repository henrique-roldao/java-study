public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 2424);
        Conta novaConta = new Conta(1337, 2392);
        Conta terceiraConta = new Conta(1337, 3920);

        conta.setAgencia(-50);
        conta.setNumero(-330);

        System.out.println(Conta.getTotal());
    }
}
