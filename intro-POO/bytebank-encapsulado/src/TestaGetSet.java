public class TestaGetSet {
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 2424);

        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();

        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");
    }
}
